
import java.util.Scanner;

public class Lt_1_Ex_05
{
    
    public static void main (String args []) 
    {
        
        double a, b, c, delta, x, x1;
    
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Digite o valor de a: ");
        a = ler.nextDouble();
       
        System.out.println("Digite o valor de b: ");
        b = ler.nextDouble();
       
        System.out.println("Digite o valor de c: ");
        c = ler.nextDouble();
       
        delta = (b * b) - 4 * a * c;
       
        x = ((-(b) + Math.sqrt(delta)) / 2 * a);
       
        x1 = ((-(b) - Math.sqrt(delta)) / 2 * a);
       
        System.out.println("Raízes reais: " + x + " e " + x1);
        
    }
    
}
