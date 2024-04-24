package Ex;

import javax.swing.JOptionPane;

public class Ex_37 {

	public static void main(String[] args) {
		  int n, cta, p, s;

		  n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		  p = 0;
		  s = 1;
		 
		  System.out.println(1);
		  
		  for (int i = 0; i < n; i++) {
			  cta = p + s;
			  System.out.println(cta);
			  cta = s;
			  s = p + s;
			  p = cta;
		}
	}

}
