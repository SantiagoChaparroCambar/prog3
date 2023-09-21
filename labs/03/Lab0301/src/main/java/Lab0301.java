
import java.util.LinkedList;
import java.util.Queue;

public class Lab0301 {
    static LinkedList<Asignatura> materias = new LinkedList<>();
static Queue<Registro> regis =new LinkedList<>();
    static Queue<String> codes = new LinkedList<>();   // Cola de códigos de estudiantes

    public static void main(String[] args) {
        boolean siga = true;
       carga_asignaturas(args[0]);
        do {
            siga = registro_estudiante();
            if (!siga) break;
            registro_asignaturas();
            reporte_registro();
        } while (true);
        
    }
    public static void carga_asignaturas(String archivo) {
        materias = Entrada.loadFile(archivo);
    }
    
    public static void registro_estudiante(){
String codigo = Entrada.readText("DATOS ESTUDIANTE\n\n Código (-1=FIN): ");
        if (codigo.equals("-1")) return false;
        if (codes.contains(codigo)) {
            System.out.println(" Codigo " + codigo + " ya registrado\n");
            return true;
        }
        String nombre = Entrada.readText(" Nombre: ");
        String correo = Entrada.readText(" Correo: ");   
        int semestre = Entrada.readInt(" Semestre: ");
        System.out.println();

        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);

        regis.add(new Registro(estud));
        codes.add(codigo);

        return true;   
    }
    public static void registro_asignatura(){
      Registro registroActual = regis.peek();

    int totalCreditos = 0;
    boolean continuar = true;

    do {
        int sem = Entrada.readInt("\nVer asignaturas del semestre: ", 1, 10);
        mostrar_asignaturas(sem);

        int codigoAsignatura = Entrada.readInt("Ingrese el código de la asignatura que desea registrar: ");
        Asignatura asignaturaSeleccionada = buscarAsignaturaPorCodigo(codigoAsignatura);

        if (asignaturaSeleccionada != null) {
            // Verificar si hay cruce de horarios
            if (!verificarCruceHorarios(registroActual, asignaturaSeleccionada)) {
                registroActual.addAsignatura(asignaturaSeleccionada);
                totalCreditos += asignaturaSeleccionada.getNum_creditos();

                if (totalCreditos >= 16) {
                    continuar = false;
                    System.out.println("Ha alcanzado el límite de créditos (16).");
                }
            } else {
                System.out.println("¡Cruce de horarios! No se puede registrar esta asignatura.");
            }
        } else {
            System.out.println("La asignatura no existe.");
        }

        if (totalCreditos >= 5 && totalCreditos < 16) {
            String continuarRegistro = Entrada.readText("¿Desea registrar otra asignatura? (s/n): ");
            if (!continuarRegistro.equalsIgnoreCase("s")) {
                continuar = false;
            }
        } else if (totalCreditos >= 16) {
            continuar = false;
        }
    } while (continuar);
    }

    public static Asignatura buscarAsignaturaPorCodigo(int codigo) {
        for (Asignatura asignatura : materias) {
            if (asignatura.codigo == codigo) {
                return asignatura;
            }
        }
        return null;
    }
    public static void reporte_registro_final(){
      if (regis.isEmpty()) {
        System.out.println("No hay registros para mostrar.\n");
        return;
    }

    for (Registro registro : regis) {
        System.out.println("DATOS ESTUDIANTE");
        System.out.println(" Código: " + registro.getEstudiante().getCodigo());
        System.out.println(" Nombre: " + registro.getEstudiante().getNombre());
        System.out.println(" Correo: " + registro.getEstudiante().getCorreo());
        System.out.println(" Semestre: " + registro.getEstudiante().getSemestre());

        System.out.println("\nMaterias Registradas:");
        for (Asignatura asignatura : registro.getListAsignatura()) {
            System.out.println(asignatura);
        }

        int totalCreditos = 0;
        for (Asignatura asignatura : registro.getListAsignatura()) {
            totalCreditos += asignatura.getNum_creditos();
        }
        System.out.println("Total de Créditos: " + totalCreditos);
        System.out.println("\n-------------------------\n");
    }
}
}

public static boolean verificarCruceHorarios(Registro registro, Asignatura nuevaAsignatura) {
    for (Asignatura asignatura : registro.getListAsignatura()) {
        if (asignatura.getSemestre() == nuevaAsignatura.getSemestre()) {
            if (asignatura.getHorario().equals(nuevaAsignatura.getHorario())) {
                return true; // Existe cruce de horarios
            }
        }
    }
    return false; // No hay cruce de horarios
}
