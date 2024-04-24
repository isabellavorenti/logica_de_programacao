
import javax.swing.JOptionPane;

public class Ex_25 
{
    
    public static void main (String args []) 
    {
        
        double horaInicial, horaFinal, tempoTotal;
        
        horaInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o horário de início: "));
        horaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o horário final do jogo: "));
        
        if (horaFinal < horaInicial) 
        {
            tempoTotal = (24 - horaInicial) + horaFinal;
            JOptionPane.showMessageDialog(null, "O tempo total do jogo foi de " + tempoTotal + " horas.");
        } 
        
        else if (horaInicial < horaFinal)
        {
            tempoTotal = horaFinal - horaInicial;
            JOptionPane.showMessageDialog(null, "O tempo total do jogo foi de " + tempoTotal + " horas.");            
        } 
        
        else
        {
            JOptionPane.showMessageDialog(null, "O jogo durou 24 horas.");
        }
        
    }
    
}
