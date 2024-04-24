
import java.util.Scanner;

public class Ex_35
{

	public static void main(String[] args) 
	{
		
		int x, y, soma = 0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		x = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		y = ler.nextInt();
		
		if (x > y) 
		{
			for (int i = y; i <= x; i++)
			{
				if (i % 2 != 0) 
				{
					soma += i;
				} 
			}
		}
		
		else if ((y > x))
		{
			for (int i = x; i <= y; i++) 
			{
				if (i % 2 != 0) 
				{
					soma += i;
				} 
			}
		}
		
		System.out.println("Resultado da soma: " + soma);
		
	}
	
}
		
