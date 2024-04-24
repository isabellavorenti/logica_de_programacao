
import java.util.Scanner;

public class Lt_1_Ex_06 {
    public static void main (String args []) {
        double x, y, z;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira o valor de x: ");
        x = ler.nextDouble();
        
        System.out.println("Insira o valor de y: ");
        y = ler.nextDouble();
        
        System.out.println("Conteúdo enviado de x: " + x + ", y: " + y);
        z = x;
        x = y;
        y = z;
        
        System.out.println("Conteúdo atual de x: " + x + ", y: " + y);
    }
}
