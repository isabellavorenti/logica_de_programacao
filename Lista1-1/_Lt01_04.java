
import java.util.Scanner;

public class Lt_1_Ex_04 {
    public static void main (String args []) {
        double tempC, tempF;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        tempC = ler.nextDouble();
        
        tempF = (9 * tempC + 160) / 5;
        
        System.out.println("Temperatura convertida em Fahrenheit: " + tempF + "°F");
    }
}
