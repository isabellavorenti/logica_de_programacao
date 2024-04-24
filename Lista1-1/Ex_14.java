package Exercicios;

import javax.swing.JOptionPane;

public class Ex_14 
{

	public static void main(String[] args)
	{
		
		int a1, a2, a3;
		
		a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro ângulo: "));
		
		a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo ângulo: "));
		
		a3 = (180 - a1 - a2);
		
		JOptionPane.showMessageDialog(null, "Ângulo 3 = " + a3 + "°");
		
	}

}
