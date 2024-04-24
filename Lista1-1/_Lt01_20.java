
import javax.swing.JOptionPane;

public class _Lt01_20 {
    
    public static void main (String args []) {
        double a, b, c, x1, x2, delta;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente de B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente de C: "));
        
        delta = Math.pow(b, 2) - (4 * a * c);
        
        if (delta > 0) {
            x1 = (- b + Math.sqrt(delta)) / 2 * a; 
            x2 = (- b - Math.sqrt(delta)) / 2 * a; 
            JOptionPane.showMessageDialog(null, "Raízes reais: " + x1 + " e " + x2);
            
        } else if (delta == 0) {
            x1 = (- b + Math.sqrt(delta)) / 2 * a; 
            JOptionPane.showMessageDialog(null, "A equação possui apenas uma raíz: " + x1);
            
        } else if (delta < 0){
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
        }
            
        
        
       
    }
}
