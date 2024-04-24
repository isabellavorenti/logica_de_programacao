package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_29 {

	public static void main(String[] args) {
		int tipo;
		double valorInv, valorNovo;

		tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do tipo de investimento:"
															+ "\n1 - Poupança \n2 - Renda Fixa"));
		valorInv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido: "));
		
		if (tipo == 1) {
			valorNovo = valorInv + (valorInv * 0.03);
			JOptionPane.showMessageDialog(null, "Valor do Investimento em Poupança após 30 dias: R$ " + valorNovo);
			
		} else if (tipo == 2){
			valorNovo = valorInv + (valorInv * 0.05);
			JOptionPane.showMessageDialog(null, "Valor do Investimento em Renda Fixa após 30 dias: R$ " + valorNovo);

		} else {
			JOptionPane.showMessageDialog(null, "O valor de investimento fornecido é inexistente.");
		}
	}

}
