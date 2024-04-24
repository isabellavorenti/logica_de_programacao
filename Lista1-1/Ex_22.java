
import javax.swing.JOptionPane;

public class Ex_22 
{
    
    public static void main (String args []) 
    {
        
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if (n1 > n2)
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente dos valores: " + n2 + ", " + n1);
        } 
        
        else if (n1 < n2)
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente dos valores: " + n1 + ", " + n2);
        } 
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Valores iguais.");
        }
        
    }
    
}
