
import javax.swing.JOptionPane;

public class Ex_11 
{

	public static void main(String[] args) 
	{
		
		double raio, comp;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio: "));
		
		comp = (raio * 2 * Math.PI);
		
		JOptionPane.showMessageDialog(null, "Valor do comprimento = " + comp);

	}

}
