package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_27 {

	public static void main(String[] args) {
		
		double extensao, duracao, vm, espaco, voltas;
		
		voltas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de voltas efetuadas: "));
		extensao = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito em metros: "));
		duracao = Double.parseDouble(JOptionPane.showInputDialog("Insira a duração do percurso em minutos: "));
		
		espaco = voltas * extensao;
		
		vm = ((espaco / duracao) * 0.06);

		
		JOptionPane.showMessageDialog(null, "Velocidade média: " + vm + "km/h");
	}

}
