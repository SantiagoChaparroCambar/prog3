
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.io.File;

public class Entrada {
    private static Scanner input = new Scanner(System.in);
    
           
    public static int readInt(String mss){
       String str = null;
        do {
            str = readText(mss);
        } while (!str.matches("-?\\d+(\\.\\d+)?"));
        return Integer.parseInt(str);
    }

    public static int readInt(String mss, int min, int max) {
        int val = 0;
        do {
            val = readInt(mss);
        } while (val < min || val > max);
        return val;
    }
    
    public static String readText(String mss){
        System.out.println(mss);
        return input.nextLine();
    }
public static LinkedList<Asignatura> loadFile(String filename) {
        LinkedList<Asignatura> listAsignatura = new LinkedList<>();
        Scanner file = null;
        try {
            file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                String line[] = file.nextLine().split(";");
                listAsignatura.add(new Asignatura(Integer.parseInt(line[0]),
                        line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]),
                        line[4]));
            }
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listAsignatura;
    }
    
}
