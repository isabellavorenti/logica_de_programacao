
import java.util.Scanner;

public class Lt_1_Ex_02 {
    public static void main (String args []) {
        double salario, reajuste;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Entre com o valor do salário: ");
        salario = ler.nextDouble();
        
        reajuste = salario + (salario *0.15);
        
        System.out.println("Novo salário com reajuste: R$" + reajuste);
    }
}
