
import javax.swing.JOptionPane;

public class _Lt01_24 {
    
    public static void main (String args []) {
        int n, v1, v2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        
        if ((n % 2 == 0) && (n % 3 == 0)) {
            v1 = n / 2;
            v2 = n / 3;
            JOptionPane.showMessageDialog(null, "O valor " + n + " é divisível por 2 e 3. "
                                          + "\nDivisão por 2 = " + v1 + "\nDivisão por 3 = " + v2);
            
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + n + " não é dívisível por 2 e 3.");
        }
        
    }
}
