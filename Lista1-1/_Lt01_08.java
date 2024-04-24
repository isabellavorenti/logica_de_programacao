package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_08 {

	public static void main(String[] args) {
		double deposito, valor;
		int mes;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Insira os meses de aplicação: "));
		
		deposito *= mes;
		valor = deposito + (deposito * 0.013);
		
		if (mes == 1) {
			JOptionPane.showMessageDialog(null, "Valor atual = R$ " + valor + "\n" + mes + " mês de aplicação.");
			
		} else {
			JOptionPane.showMessageDialog(null, "Valor atual = R$ " + valor + "\n" + mes + " meses de aplicação.");
		
		}
	}

}
