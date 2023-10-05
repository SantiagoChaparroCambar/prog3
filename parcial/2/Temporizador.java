import java.util.TimerTask;

public class Temporizador extends TimerTask{
  private String mensaje;

  public Temporizador(String mensaje){
    this.mensaje= mensaje;
  }
  @Override
  public void run(){
    System.out.println(mensaje);
  }
}
