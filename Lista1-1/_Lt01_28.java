package Exercicios;

import javax.swing.JOptionPane;

public class _Lt01_28 {

	public static void main(String[] args) {
		double precoAtual, mediaMensal, novoPreco;

		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média de venda mensal: "));
		
		if ((mediaMensal < 500) && (precoAtual < 30)) {
			novoPreco = precoAtual + (precoAtual * 0.1);
			JOptionPane.showMessageDialog(null, "Novo preço = R$ " + novoPreco);
			
		} else if  ((mediaMensal >= 500) && (mediaMensal < 1000) && (precoAtual >= 30) && (precoAtual < 80)){
			novoPreco = precoAtual + (precoAtual * 0.15);
			JOptionPane.showMessageDialog(null, "Novo preço = R$ " + novoPreco);
			
		} else if ((mediaMensal >= 1000) && (precoAtual >= 80)) {
			novoPreco = precoAtual - (precoAtual * 0.05);
			JOptionPane.showMessageDialog(null, "Novo preço = R$ " + novoPreco);
			
		} else {
			novoPreco = precoAtual;
			JOptionPane.showMessageDialog(null, "Novo preço = R$ " + novoPreco);
		}
	}

}
