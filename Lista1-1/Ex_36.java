package Ex;

import javax.swing.JOptionPane;

public class Ex_36 {

	public static void main(String[] args) {
		 double soma, div, n, fat;
		                                                                          
		 fat = 1;
		 soma = 1;
		 n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		 
		 for (int i = 1; i <= n; i++) {
			 for (int j = 1; j <= i; j++) {
				fat = fat * j;
				
			}
			 
			div = 1/fat;
			soma = div + soma;
			fat = 1;
		} 
		
		System.out.println("n = " + n);
		System.out.println("Total = " + soma);
	}

}
