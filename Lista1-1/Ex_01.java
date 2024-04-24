import javax.swing.JOptionPane;

public class Lt_1_Ex_01
{
    
    public static void main (String args [])
    {
        
        double lado, area;
    
        lado = Double.parseDouble(JOptionPane.showInputDialog("Entre com o lado do quadrado: "));
       
        area = (lado * lado);
    
        JOptionPane.showMessageDialog(null,"A área do quadrado é = " + area);
    
    }
}
