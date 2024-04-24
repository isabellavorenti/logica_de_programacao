
import javax.swing.JOptionPane;

public class _Lt01_19 {
    
    public static void main (String args []) {
        double a, b;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        if (a > b) {
            JOptionPane.showMessageDialog(null, "Maior valor: " + a);
            
        } else if (a < b) {
            JOptionPane.showMessageDialog(null, "Maior valor: " + b);
            
        } else {
            JOptionPane.showMessageDialog(null, "Valores iguais.");
        }
    }
}
