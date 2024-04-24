
import java.util.Scanner;

public class Lt_1_Ex_03 {
    public static void main (String args []) {
        double base, altura, area;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira a base: ");
        base = ler.nextDouble();
        
        System.out.println("Insira a altura: ");
        altura = ler.nextDouble();
        
        area = (altura * base) / 2;
        
        System.out.println("Área do triângulo = " + area);
    }
}
