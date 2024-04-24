
import javax.swing.JOptionPane;

public class _Lt01_23 {
    
    public static void main (String args []) {
        int a, b, c, d;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 4: "));
        
        if (d < a) {
            JOptionPane.showMessageDialog(null, "Ordem: " + d + ", " + a + ", " + b + ", " + c);
            
        } else if ((d > a) && (d < b)) {
            JOptionPane.showMessageDialog(null, "Ordem: " + a + ", " + d + ", " + b + ", " + c);
            
        } else if ((d > b) && (d < c)) {
             JOptionPane.showMessageDialog(null, "Ordem: " + a + ", " + b + ", " + d + ", " + c);
            
        } else if (d > c) {
             JOptionPane.showMessageDialog(null, "Ordem: " + a + ", " + b + ", " + c + ", " + d);
            
        }
        
        
    }
}
