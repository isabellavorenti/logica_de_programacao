package Lt01_31_45;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		int fat = 1, n, cta;

		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		n = ler.nextInt();
		
		for (cta = 1; cta <= n; cta++) {
			fat = (fat * cta);
			
		}
		
		System.out.println("Fatorial de " + n + " = " + fat);
	
	}
	

}
