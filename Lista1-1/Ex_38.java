
import javax.swing.JOptionPane;

public class Ex_38 
{
        
    public static void main(String [] args) 
    {
            
        int valor = 0, num;
        double maior = 0, menor = 0;
            
        for (int i = 0; i < 100; i++) 
        {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            
            if (num > 0) 
            {
                valor += 1;
                
                if (valor == 1) 
                {
                    maior = num;
                    menor = num;  
                } 
                
                else if (num > maior)
                {
                    maior = num;     
                } 
                
                else if (num < menor)
                {
                    menor = num;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
        
    }
    
}
