
import javax.swing.JOptionPane;

public class Ex_12 
{

	public static void main(String[] args) 
	{
		int nascimento, anoAtual, idade, idadeFutura;
		
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		idade = (anoAtual - nascimento);
		
		idadeFutura = (idade + 17);
		
		JOptionPane.showMessageDialog(null, "Sua idade é de " + idade + " anos."
										+ "\nDaqui 17 anos, você terá " + idadeFutura + " anos.");
		
	}

}
