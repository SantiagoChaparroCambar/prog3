
public class Asignatura {
    int codigo;
    String nombre;
    int semestre;
    int num_creditos;
    String horario;
    
     public Asignatura(int codigo, String nombre, int semestre, int num_creditos,
            String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.num_creditos = num_creditos;
        this.horario = horario;
    }

    public int getSemestre() {
        return semestre;
    }
    
    public int getNum_creditos() {
        return num_creditos;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return String.format("%-7d  %-35s%5d%7s", codigo, nombre, num_creditos, horario);
    }
}
