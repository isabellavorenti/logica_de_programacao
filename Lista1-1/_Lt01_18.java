
import javax.swing.JOptionPane;

public class _Lt01_18 {
    
    public static void main(String args []){
        int a, b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));
        
        if (a > b) {
            a -= b;
            JOptionPane.showMessageDialog(null, "Resultado da subtração = " + a);
        } else if (b > a){
            b -= a;
            JOptionPane.showMessageDialog(null, "Resultado da subtração = " + b);
            
        } else {
            JOptionPane.showMessageDialog(null, a + " = " + b);
        }
}
            
}
