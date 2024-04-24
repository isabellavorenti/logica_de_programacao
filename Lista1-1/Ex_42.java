package Atividades;

public class Ex_42
{

	public static void main(String[] args)
	{

		double div = 1, total = 0;
		
		for (int i = 1; i < 5; i++) 
		{
			
			total = ((i / div) + total);
			
			div += 2;
			
		}
		
		System.out.println("Total = " + total);

	}

}
