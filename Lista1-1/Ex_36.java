
import javax.swing.JOptionPane;

public class Ex_36
{

	public static void main(String[] args) 
	{
		
		 double soma = 1, div, n, fat = 1;
		    
		 n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		 
		 for (int i = 1; i <= n; i++)
		 {
		 	for (int j = 1; j <= i; j++) 
			{
				fat *= j;
			}
			 
			div = (1 / fat);
			soma += div;
			fat = 1;
		} 
		
		System.out.println("n = " + n);
		System.out.println("Total = " + soma);
		
	}

}
