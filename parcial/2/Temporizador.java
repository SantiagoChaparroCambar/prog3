import java.util.TimerTask;

public class Temporizador extends TimerTask {
    private String mensaje;
    private long retraso; // Cambié int a long

    public Temporizador(String mensaje, long retraso) { // Agregué el constructor con mensaje y retraso
        this.mensaje = mensaje;
        this.retraso = retraso;
    }

    public String getMensaje() {
        return mensaje;
    }

    public long getRetraso() {
        return retraso;
    }

    @Override
    public void run() {
        System.out.println(mensaje);
    }
}

