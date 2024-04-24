package Exercicios;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _Lt01_10 {

	public static void main(String[] args) {
		double a, b, sub;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		sub = a - b;
		
		JOptionPane.showMessageDialog(null, "Resultado da subtração = " + sub);
	}

}
