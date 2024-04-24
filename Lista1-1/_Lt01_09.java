package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_09 {

	public static void main(String[] args) {
		int a, b, soma;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
	
		soma = (int) ((Math.pow(a, 2)) + (Math.pow(b, 2)));
		
		JOptionPane.showMessageDialog(null, "Valor da soma dos quadrados: " + soma);
		
	}

}
