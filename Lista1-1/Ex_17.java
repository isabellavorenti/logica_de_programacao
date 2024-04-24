package Aulas;

import java.util.Scanner;

public class Ex_17 
{

	public static void main(String[] args) 
	{
		
		double vm, t, e, qtde;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o tempo do percurso em h: ");
		t = ler.nextDouble();
		
		System.out.println("Insira a velocidade média em km/h: ");
		vm = ler.nextDouble();
		
		e = (vm * t);
		
		qtde = (e / 12);
				
		System.out.println("Quantidade de litros gastos na viagem = " + qtde);
		
	}

}
