package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_15 {

	public static void main(String[] args) {
		int c1, c2;
		double hipotenusa;
		
		c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
		c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));

		hipotenusa = (Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2)));
		
		JOptionPane.showMessageDialog(null, "Valor da hipotenusa = " + hipotenusa);
	}

}
