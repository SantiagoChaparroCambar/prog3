import java.util.Scanner;

public class Quiz1_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Ingrese un numero n: ");
        int n = scanner.nextInt();
        System.out.flush();
        for(int i=1; i<=n;i++){
            if(i%3 == 0 && i%5 ==0){
              System.out.println("fizzbuzz");
            }else if(i%3 == 0){
               System.out. println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            } else  if(i<n){
            System.out.println(i);
            }
        }
    
    }
}

