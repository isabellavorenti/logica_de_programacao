
import java.util.Scanner;

public class Ex_34
{

	public static void main(String[] args) 
	{
		
		int mult, n;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		n = ler.nextInt();
		
		for (int i = 0; i <= 10; i++) 
		{
			mult = (n * i);
			System.out.println(n + " x " + i + " = " + mult);
		}

	}

}
