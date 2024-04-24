package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_13 {

	public static void main(String[] args) {
		double alimento, duracao;
		
		alimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em quilos: "));
		
		duracao = (alimento * 1000) / 50;
		
		JOptionPane.showMessageDialog(null, "O alimento durará " + duracao + " dias.");

	}

}
