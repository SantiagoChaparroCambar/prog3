package carrera; 
import static java.lang.Math.random;
import java.lang.Math;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class carrera extends Thread {
    // crear variables
    private JLabel etiqueta;
    private final interfaz auto;
    
    public carrera(JLabel etiqueta, interfaz auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    
    @Override
    public void run() {
        int car1 = 0;
        int car2 = 0;
        int car3 =0;
        int car4 =0;
        while(true) {
            try {
                sleep((int)(Math.random()*1000));
                car1 = auto.getcarro1().getLocation().x;
                car2 = auto.getcarro2().getLocation().x;
                car3 = auto.getcarro3().getLocation().x;
                car4 = auto.getcarro4().getLocation().x;
                
                if(car2 < auto.getbarrera().getLocation().x - 125 && car1 < auto.getbarrera().getLocation().x - 125 ) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y );
                    auto.repaint();
                } else {
                    break;
                }
            } catch(InterruptedException e) {
                System.out.println("e");
            }
            if(etiqueta.getLocation().x >= 125-auto.getbarrera().getLocation().x ) {
                if (car2 < car1 && car3 < car1 && car4 < car1) {
                  JOptionPane.showMessageDialog(null,"Gano el primer auto");
                
                } else if(car2 > car1 && car3< car2 && car4<car2) {
                    JOptionPane.showMessageDialog(null,"Gano el segundo auto");
                } else if (car3>car1 && car3>car2 && car3>car4){
                    JOptionPane.showMessageDialog(null,"Gano el tercer auto");
                }else if (car4>car1 && car4>car2 && car4>car3){
                    JOptionPane.showMessageDialog(null,"Gano el cuato auto");
             }else {
                    JOptionPane.showMessageDialog(null,"Empate");
                }
            }
        }
    }
}
