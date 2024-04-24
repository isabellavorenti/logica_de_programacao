
import java.util.Scanner;

public class Lt_1_Ex_07 
{
    
    public static void main (String args [])
    {
        
        double comp, alt, larg, volume;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira o valor do comprimento: ");
        comp = ler.nextDouble();
        
        System.out.println("Insira o valor da largura: ");
        larg = ler.nextDouble();
        
        System.out.println("Insira o valor da altura: ");
        alt = ler.nextDouble();
        
        volume = (comp * larg * alt);
        
        System.out.println("Volume = " + volume);
        
    }
    
}
