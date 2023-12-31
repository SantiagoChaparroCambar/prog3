import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class LecturaDatos {
    private final List<Tramo> tramos;

    public LecturaDatos() {
        tramos = new ArrayList<>();
        cargarTramosDesdeArchivo();
    }

    private void cargarTramosDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("datos2.txt"))) {
            while (scanner.hasNextLine()) {
                String[] datosTramo = scanner.nextLine().split(",");
                if (datosTramo.length >= 10) { // Asegúrate de que haya suficientes campos en la línea
                    Tramo tramo = new Tramo(Integer.parseInt(datosTramo[1]), datosTramo[3], datosTramo[9]);
                    tramos.add(tramo);
                    System.out.println(datosTramo[1]+"a");
                } else {
                    System.out.println("La línea no tiene suficientes campos: " + Arrays.toString(datosTramo));
                }
            }
            String currentDirectory = System.getProperty("user.dir");
            System.out.println("a"+scanner.hasNextLine()+currentDirectory);
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
     public int[] departamentoPorRegion(){
        int mpr[] = new int [6];
        int i=0;
        while (i<tramos.size()){
            Tramo temp = tramos.get(i);
            switch (temp.Departamento){
                case "CUNDINAMARCA":   mpr[0]+=1;
                                break;
                case "META" :    mpr[1]+=1;
                                    break;
                case "BOYACA":    mpr[2]+=1;
                                                    break;
                case "SANTANDER":  mpr[3]+=1;
                                        break;
                case "CESAR":  mpr[4]+=1;
                                    break;
                case "ANTIOQUIA":  mpr[5]+=1;
                                break;
                default:    System.out.println("Error: La region "+temp.Departamento+" no esta dentro de las posibles.");
                            break;
            }
            i++;
        }
        return mpr;
    }
}

