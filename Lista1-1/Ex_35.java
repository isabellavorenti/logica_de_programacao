package Lt01_31_45;

import java.util.Scanner;

public class Ex_35 {

	public static void main(String[] args) {
		int x, y, soma = 0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		x = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		y = ler.nextInt();
		
		if (x > y) {
			for (int i = 0; i <= x; i++) {
				if ((x % 3 == 0) && (y % 3 == 0)) {
					soma = soma + (x + y) ;
				} else {
					soma = soma + 0;
				}
			}
			
		} else if ((y > x) || (x == y)){
			for (int i = 0; i <= y; i++) {
				if ((x % 3 == 0) && (y % 3 == 0)) {
					soma = soma + (x + y) ;
				} else {
					soma = soma + 0;
				}
		

		}
	}
		
		System.out.println("Resultado da soma: " + soma);
}
	
	
	
}
		
