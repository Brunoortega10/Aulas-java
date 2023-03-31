package Aula01;
import java.util.Scanner;
public class Main {
   
    public static void Aula01(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int A, B, PROD;
        
        A = leitor.nextInt();
        B = leitor.nextInt();
        
        PROD = A * B;
        
        System.out.println("PROD = " + PROD);
        
        leitor.close();
    }
    
}
