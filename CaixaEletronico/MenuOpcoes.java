package CaixaEletronico;

import javax.swing.JOptionPane;

public class MenuOpcoes 
{
	
	public static void main (String[] args) 
	{
		
		int opc = 0;
		
		Operacoes acao = new Operacoes();
		
		while (opc != 9) 
		{
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("CAIXA ELETRÔNICO \n\nMenu Principal \n1 - Carregar Notas"
					+ " \n2 - Retirar Notas \n3 - Estatística \n9 - Fim \n"));
			
			switch (opc) 
			{
			
			case 1:
				
				acao.RecebeNotas();
				
				break;
			
			case 2:
				
				acao.Banco();
				
				break;
			
			case 3:
				
				acao.Estatistica();
				
				break;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "       Programa finalizado");
		
	}
	
}
