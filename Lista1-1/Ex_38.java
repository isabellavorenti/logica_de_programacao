package Vetor_21_03_24;

import javax.swing.JOptionPane;

    public class Ex38 {
        public static void main(String [] args) {
            
            
            int valor;
            double maior, menor, num;
            
            maior = 0;
            menor = 0;
            valor = 0;
            
            for (int i = 0; i < 10; i++) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição " + i + ": "));
                if (num>0) {
                    valor = valor + 1;
                    if (valor == 1) {
                        maior = num;
                        menor = num;
                        
                    } else if (num > maior){
                        maior = num;
                        
                    } else if (num < menor){
                        menor = num;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
        }
    
}
