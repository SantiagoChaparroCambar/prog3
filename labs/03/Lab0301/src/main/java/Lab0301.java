
import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Estudiante
 */
public class Lab0301 {
static Queue<Registro> regis =new LinkedList<>();

    public static void main(String[] args) {
        
        registro_estudiante();
        registro_asignatura();
        reporte_registro_final();
        
    }
    public static void registro_estudiante(){
        
        String codigo= Entrada.readText("Codigo estudiante");
        String nombre = Entrada.readText("Nombre estudiante");
        String correo = Entrada.readText("correo estudiante");
        int semestre = Entrada.readInt("semestre  estudiante");
        Estudiante estud = new Estudiante(codigo,nombre,correo,semestre);
    regis.add(new Registro(estud));
        
    }
    public static void registro_asignatura(){
        
    }
    public static void reporte_registro_final(){
        
    }
}
