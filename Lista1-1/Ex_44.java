package Atividades;

import javax.swing.JOptionPane;

public class Ex_44 
{
	public static void main(String[] args) 
	{
		double base, exp, pot = 1;
	
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
		exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente: "));
		
		for (int i = 0; i < exp; i++)
		{
			pot = (pot * base);
		}
		
		System.out.println("Total = " + pot);
		
	}
}
