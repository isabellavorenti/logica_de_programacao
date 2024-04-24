
import javax.swing.JOptionPane;

public class _Lt01_26 {
    
    public static void main (String args []) {
        
        int a, b, div;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor inteiro: "));
        
        if (a > b) {
            if (a % b == 0) {
                div = a / b;
                JOptionPane.showMessageDialog(null, "O valor " + a + " é múltiplo de " + b + "\nDivisão = " + div);
            
            } else {
                JOptionPane.showMessageDialog(null, "O valor " + a + " não é múltiplo de " + b);
            } 
        } else {
            if (b % a == 0) {
                div = b / a;
                JOptionPane.showMessageDialog(null, "O valor " + b + " é múltiplo de " + a + "\nDivisão = " + div);
           
            } else {
                JOptionPane.showMessageDialog(null, "O valor " + b + " não é múltiplo de " + a);
                
            }
        }
    }
}
