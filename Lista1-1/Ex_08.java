import javax.swing.JOptionPane;

public class Ex_08
{

	public static void main(String[] args) 
	{
		
		double deposito, valor;
		int mes;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito: "));
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Insira os meses de aplicação: "));
		
		deposito *= mes;
		valor = (deposito + (deposito * 0.013));
		
		JOptionPane.showMessageDialog(null, "Valor atual = R$ " + valor + "\nEm" + mes + " meses de aplicação.");

	}
	
}
