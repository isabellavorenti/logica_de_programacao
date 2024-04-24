package Atividades;

import javax.swing.JOptionPane;

public class Ex_41
{
	public static void main(String[] args)
	{
		int lado, total = 0, x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado entre 2 e 12: "));
		
		for (int i = 1; i < 7; i++)
		{
			for (int j = 1; j < 7; j++)
			{
				lado = (i + j);
				
				if (lado == x)
				{	
					System.out.println("Dado 1 = " + i + "\nDado 2 = " + j + "\n");
			
					total += 1;
				}
			}	
		}
		
		System.out.println("Número total de possibilidades: " + total);
		
	}
}
