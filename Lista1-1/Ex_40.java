package Atividades;

import java.util.Scanner;

public class Ex_40
{

	public static void main(String[] args)
	{
		
		int x, y, total = 0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		x = ler.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		y = ler.nextInt();
		
		if (x > y) 
		{
			System.out.println("\nPrimos: \n");
			
			for (int i = y; i <= x; i++)
			{
				
				if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i == 2 || i == 3 || i == 5 || i == 7) 
				{
					
					System.out.println(i);
					total += 1;
					
				}
			}
			
			System.out.println("\nQuantidade total de primos: " + total);
			
		}
		
		else if (y > x)
		{
			
			System.out.println("\nPrimos: \n");
			
			for (int i = x; i <= y; i++)
			{
				
				if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i == 2 || i == 3 || i == 5 || i == 7) 
				{
					
					System.out.println(i);
					total += 1;
					
				}
				
			}
			
			System.out.println("\nQuantidade total de primos: " + total);
			
		}
		

	}

}
