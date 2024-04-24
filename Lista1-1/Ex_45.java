package Atividades;

public class Ex_45
{
	public static void main(String[] args)
	{
		double pot, total = 0;
		
		for (int i = 1; i < 16; i++) 
		{
			pot = (i * i);
			
			if (i % 2 == 0)
			{
				total -= (i/pot);
			} 
			
			else
			{
				total += (i/pot);
			}
		}
	
		System.out.println("Total = " + total);
	}
}
