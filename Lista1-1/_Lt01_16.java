package Aulas;

import java.util.Scanner;

public class _Lt01_16 {

	public static void main(String[] args) {
		double horasTrabalhadas, valorHora, pDesconto, salarioLiquido, salarioBruto, nDescendentes;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		horasTrabalhadas  = ler.nextDouble();
		System.out.println("Insira o valor por hora: ");
		valorHora  = ler.nextDouble();
		System.out.println("Insira o percentual de desconto: ");
		pDesconto  = ler.nextDouble();
		System.out.println("Insira o número de descendentes: ");
		nDescendentes = ler.nextDouble();
		
		salarioBruto = horasTrabalhadas * valorHora;
		salarioLiquido = (salarioBruto - (salarioBruto * (pDesconto/100)) + (nDescendentes * 100));
		
		System.out.println("Salário Líquido = R$" + salarioLiquido);
		
		

	}

}
