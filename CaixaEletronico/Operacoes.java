package CaixaEletronico;

import javax.swing.JOptionPane;

public class Operacoes 

{
	
	// VARIÁVEIS GLOBAIS (exclusivamente para facilitar o processo e entendimento do exercício):
	
		// valortotalsaque = Valor inicial do caixa ||||| valor = leva o valortotalsaque para o módulo do banco para fazer as devidas comparações |||||
		// saque = serve para ir subtraindo o valortotalsaque e demonstrar ao usuário o quanto resta ||||| op = opção que recebe 1 para sacar ou 0 para pular a nota ||||| 
		// saldototal = atualiza o valor que tem em caixa.
	
	int codigobanco, saldoinicialcaixa, valortotalsaque, saldofinal, qtde, saque, valor, op, saldototal, comp, somasaque,
	
		// Inicializadores (Servem para identificar se é a primeira vez que o banco é selecionado e contabiliza corretamente o maior e menor saque):
		cta1 = 0, cta2 = 0, cta3 = 0, cta4 = 0,
		
		// Valor total de saques de cada banco:
		totalcaixa, totalitau, totalbb, totalsantander, 
		
		// Maior saque realizado de cada banco:
		maiorbb, maiorsantander, maiorcaixa, maioritau, 
		
		// Menor saque realizado de cada banco:
		menoritau, menorsantander, menorcaixa, menorbb, 
		
		// Média de saques realizados de cada banco:
		mediabb, mediasantander, mediaitau, mediacaixa, 
		
		// Contabilizador de saques de cada banco, para realização da média:
		bb, santander, caixa, itau;
	
	// vetor = Quantidade de notas. Exemplo: [5, 3, 2, 10, 5, 2].
	// vetor1 = Valor total de cada nota (quantidade de notas x valor da nota). Exemplo: [500, 150, 40, 100, 25, 4].
	// vetor2 = Valor da nota. Neste caso, 6 tipos de notas em ordem decrescente: [100, 50, 20, 10, 5 e 2] - INVARIÁVEL (pré-determinado).
	
	int vetor [] = new int [6];
	int vetor1 [] = new int [6];
	int vetor2 [] = new int [6];
	
	
	// BANCOS INDICADOS: BANCO DO BRASIL, SANTANDER, CAIXA E ITAÚ.
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Método construtor:
	
	
	public Operacoes() 
	{
		
	}
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Módulo que recebe a quantidade de quantas notas de cada tipo que irão entrar:
	
	
	
	public void RecebeNotas() 
	{
		
		// Atribuindo valores aos vetores: 
		
		vetor1[0] = 100;
		vetor1[1] = 50;
		vetor1[2] = 20;
		vetor1[3] = 10;
		vetor1[4] = 5;
		vetor1[5] = 2;
		
		for (int i = 0; i < vetor.length; i++) 
		{
			
			vetor2[i] = vetor1[i];
			
		}
		
		// ============================================================================================================
		
		// Recebendo quantidade:
		
		JOptionPane.showMessageDialog(null, "Observação: carregar mínimo de 1 nota para cada valor!");
		
		for (int i = 0; i < vetor.length; i++) 
		{
			
				qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de " + vetor2[i] + ":"));
				vetor1[i] *= qtde;
				vetor[i] += qtde;
				saldototal += vetor1[i];
				saldoinicialcaixa += vetor1[i];
				
		}
		
		JOptionPane.showMessageDialog(null, "Saldo total do caixa: R$" + saldototal);
		
		saldofinal = saldoinicialcaixa - somasaque;
		
	}
	
	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Módulo que recebe o código do banco selecionado pelo usuário e encaminha para o módulo do banco:
	
	
	
	public void Banco() 
	{
		
		if (vetor[0] < 1 || vetor[1] < 1 || vetor[2] < 1 || vetor[3] < 1 || vetor[4] < 1 || vetor[5] < 1) 
		{
			
			JOptionPane.showMessageDialog(null, "Alerta: o caixa está com a quantidade de notas insuficientes. \nCarregar urgentemente!");
			
		} 
		
		else
		{
			
			codigobanco = 5;
			while (codigobanco != 1 && codigobanco != 2 && codigobanco != 3 && codigobanco != 4) 
			{
			
				codigobanco = Integer.parseInt(JOptionPane.showInputDialog("Código do banco: "
					+ "\n1 - Banco do Brasil"
					+ "\n2 - Santander"
					+ "\n3 - Itaú"
					+ "\n4 - Caixa"));
		
				switch (codigobanco) 
				{
			
				case 1:
					
					JOptionPane.showMessageDialog(null, "1 - Banco do Brasil");
					bb += 1;
					BancoDoBrasil();
				
					break;
			
				case 2:
					
					JOptionPane.showMessageDialog(null, "2 - Santander");
					santander += 1;
					Santander();
			
					break;
		
				case 3:
					
					JOptionPane.showMessageDialog(null, "3 - Itaú");
					itau += 1;
					Itau();
			
					break;
			
				case 4:
					
					JOptionPane.showMessageDialog(null, "4 - Caixa");
					caixa += 1;
					Caixa();
			
					break;
				
				default: 
			
					JOptionPane.showMessageDialog(null, "Código inválido.");
			
				}
			
			}
		
		}
	
	}
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Banco Caixa:
	
	
	public void Caixa() 
	{
		
		Saque();
		
		if (valortotalsaque > comp) 
		{
			
			caixa -= 1;
		
		} 
		
		else 
		{
		
			totalcaixa += valortotalsaque;
			mediacaixa = (totalcaixa/caixa);
		
			if (valor > maiorcaixa) 
			{
			
				if (cta1 == 0) 
				{
					
					maiorcaixa = valor;
					menorcaixa = valor;
					cta1 += 1;
					
				} 
			
				else 
				{
					
					maiorcaixa = valor;
					
				}
		
			} 
		
			else if (valor < menorcaixa)
			{
				
				menorcaixa = valor;

			}
			
		}
		
	}
	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Banco Itaú:
	
	

	public void Itau() 
	{

		Saque();
		
		if (valortotalsaque > comp) 
		{
			
			itau -= 1;
		
		} 
		
		else 
		{
		
			totalitau += valortotalsaque;
			mediaitau = (totalitau/itau);
		
			if (valor > maioritau) 
			{
			
				if (cta2 == 0) 
				{
					
					maioritau = valor;
					menoritau = valor;
					cta2 += 1;
					
				} 
			
				else 
				{
					
					maioritau = valor;
					
				}
		
			} 
		
			else if (valor < menoritau)
			{
				
				menoritau = valor;

			}
			
		}
		
		
	}
	
	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Banco Santander:
	

	public void Santander() 
	{

		Saque();
		
		if (valortotalsaque > comp) 
		{
			
			santander -= 1;
		
		} 
		
		else 
		{
		
			totalsantander += valortotalsaque;
			mediasantander = (totalsantander/santander);
		
			if (valor > maiorsantander) 
			{
			
				if (cta3 == 0) 
				{
					
					maiorsantander = valor;
					menorsantander = valor;
					cta3 += 1;
					
				} 
			
				else 
				{
					
					maiorsantander = valor;
					
				}
		
			} 
		
			else if (valor < menorsantander)
			{
				
				menorsantander = valor;

			}
			
		}
		
	}
	
	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Banco do Brasil:
	

	public void BancoDoBrasil() 
	{

		Saque();
		
		if (valortotalsaque > comp) 
		{
			
			bb -= 1;
		
		} 
		
		else 
		{
		
			totalbb += valortotalsaque;
			mediabb = (totalbb/bb);
		
			if (valor > maiorbb) 
			{
			
				if (cta4 == 0) 
				{
					
					maiorbb = valor;
					menorbb = valor;
					cta4 += 1;
					
				} 
			
				else 
				{
					
					maiorbb = valor;
					
				}
		
			} 
		
			else if (valor < menorbb)
			{
				
				menorbb = valor;

			}
			
		}
		
	}
	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// Módulo que calcula o saque (chamado pelo banco):
	
	
	public void Saque() 
	{
		
		valortotalsaque = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de saque: \nOBS: Fazer a retirada da maior nota para a menor!"));
		
		if (valortotalsaque > saldototal) 
		{
			
			JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA!");
		
		}
		
		else 
		{
			
			comp = saldototal;
			
			somasaque += valortotalsaque;
			
			valor = valortotalsaque;

			saque = valortotalsaque; 
		
			for (int i = 0; i < vetor.length; i++) 
			{
				
				op = 1;
				
				while (op != 0 && vetor[i] > 0 && saque >= vetor2[i]) 
				{
					
					op = Integer.parseInt(JOptionPane.showInputDialog("Notas de " + vetor2[i] +
																	  "\n1 - Retirar uma nota. \n0 - Pular para próximo valor. "
																	  + "\n \nValor restante do saque: R$" + saque));
					
					if (op == 1) 
					{
						
						saque -= vetor2[i];
						saldototal -= vetor2[i];
						vetor[i] -= 1;
						
					}

				}
				
			}
			
			JOptionPane.showMessageDialog(null, "SAQUE FINALIZADO! \nRetorne para o Menu.");
			saldofinal = saldoinicialcaixa - somasaque;
			
		}
		
	}
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	// Módulo da opção Estatística:
	
	
	public void Estatistica() 
	{
		
		System.out.println("---------------------------------------------");
		System.out.println("                ESTATÍSTICA"
							+ "\n---------------------------------------------");
		System.out.println("\nSaldo inicial do caixa: R$" + saldoinicialcaixa + ",00 \n");
		BancoDoBrasil1();
		Santander1();
		Itau1();
		Caixa1();
		System.out.println("---------------------------------------------");
		System.out.println("\nSaldo final do caixa: R$" + saldofinal + ",00");
		
	}

	public void Caixa1() 
	{
		
		System.out.println("\n---------------------------------------------");
		System.out.println("\nBANCO CAIXA");
		System.out.println("\nNúmero de saques realizados: " + caixa
				+ "\nMaior valor sacado: R$" + maiorcaixa +
				"\nMenor valor sacado: R$" + menorcaixa +
				"\nValor total dos saques: R$" + totalcaixa +
				"\nMédia dos saques: R$" + mediacaixa + "\n");

	}

	public void Itau1() 
	{
		
		System.out.println("---------------------------------------------");
		System.out.println("\nBANCO ITAÚ");
		System.out.println("\nNúmero de saques realizados: " + itau
				+ "\nMaior valor sacado: R$" + maioritau +
				"\nMenor valor sacado: R$" + menoritau +
				"\nValor total dos saques: R$" + totalitau +
				"\nMédia dos saques: R$" + mediaitau + "\n");
		
	}

	public void Santander1() 
	{
		
		System.out.println("---------------------------------------------");
		System.out.println("\nBANCO SANTANDER");
		System.out.println("\nNúmero de saques realizados: " + santander
				+ "\nMaior valor sacado: R$" + maiorsantander +
				"\nMenor valor sacado: R$" + menorsantander +
				"\nValor total dos saques: R$" + totalsantander +
				"\nMédia dos saques: R$" + mediasantander + "\n");
		
	}

	public void BancoDoBrasil1() 
	{
		
		System.out.println("---------------------------------------------");
		System.out.println("\nBANCO DO BRASIL");
		System.out.println("\nNúmero de saques realizados: " + bb
				+ "\nMaior valor sacado: R$" + maiorbb +
				"\nMenor valor sacado: R$" + menorbb +
				"\nValor total dos saques: R$" + totalbb +
				"\nMédia dos saques: R$" + mediabb + "\n");
		
	}
	
}
