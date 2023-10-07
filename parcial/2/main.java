import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.HashMap;

public class Main {
  
    static Timer timer = new Timer();
    static HashMap<Integer, TimerTask> temporizadores = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Temporizador ");
            System.out.println("2. Detener Temporizador ");
            System.out.println("3. Reiniciar Temporizador ");
            System.out.println("4. Salir ");
            System.out.println("Seleccione una opción: ");

            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1: // crear temporizador 
                    System.out.println("Ingrese el mensaje del temporizador: ");
                    String mensaje = scanner.nextLine();
                    System.out.println("Ingrese el tiempo de espera en segundos: ");
                    long segundos = scanner.nextInt(); // Cambié a long
                    scanner.nextLine();

                    //// crear una instancia de Temporizador y programar su ejecucion
                    Temporizador temporizador = new Temporizador(mensaje, segundos); // Pasé mensaje y segundos
                    temporizadores.put(temporizadores.size() + 1, temporizador);// asignar un ID a el Temporizador
                    timer.schedule(temporizador, segundos * 1000);// de milisegundos a segundos
                    break;

                case 2:// detener Temporizador 
                    System.out.println("Ingrese el ID del temporizador a detener: ");
                    int idDetener = scanner.nextInt();
                    scanner.nextLine();

                    TimerTask tareaDetener = temporizadores.get(idDetener);
                    if (tareaDetener != null) {
                        tareaDetener.cancel();// cancelar la tarea del temporizador 
                        temporizadores.remove(idDetener);//eliminaar temporizador de la lista
                        System.out.println("Temporizador Detenido!");
                    } else {
                        System.out.println("Temporizador no Encontrado!");
                    }
                    break;

                case 3:// reiniciar temporizador
                    System.out.println("Ingrese el ID del temporizador que desea reiniciar: ");
                    int idReiniciar = scanner.nextInt();
                    scanner.nextLine();

                    TimerTask tareaReiniciar = temporizadores.get(idReiniciar);
                    if (tareaReiniciar != null) {
                        tareaReiniciar.cancel(); // Cancelar la tarea del temporizador
                        temporizadores.remove(idReiniciar);// Eliminar el temporizador de la lista

                        // Volver a programar la tarea
                        Temporizador nuevoTemporizador = new Temporizador(((Temporizador) tareaReiniciar).getMensaje(), ((Temporizador) tareaReiniciar).getRetraso());
                        temporizadores.put(idReiniciar, nuevoTemporizador);
                        timer.schedule(nuevoTemporizador, nuevoTemporizador.getRetraso());

                        System.out.println("Temporizador reiniciado.");
                    } else {
                        System.out.println("Temporizador no encontrado.");
                    }
                    break;

                case 4:
                    timer.cancel();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
