
import static java.lang.Math.random;
import java.lang.Math;
import javax.swing.JLabel;


public class carrera extends Thread{
    // crear variables
    private JLabel etiqueta;
    private InterfazAuto auto;
//costructor 
    public carrera(JLabel etiqueta, InterfazAuto auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    
    @Override
    public void run(){
        int car1;
        int car2;
        int car3;
        int car4;
        while(true){
            try{
                sleep((int)(Math.random()*1000));
                car1 = auto.getcarro1().getLocation().x;
                
            }catch(InterruptedException e){
                System.out.println("e");
            }
        }
    }
}
