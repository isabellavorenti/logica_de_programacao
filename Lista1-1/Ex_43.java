package Atividades;

public class Ex_43 {

	public static void main(String[] args)
	{
		
		double altAna, altMaria, anos;
		
		altAna = 1.1;
		altMaria = 1.5;
		anos = 0;
		
		while (altAna <= altMaria) 
		{
			
			anos += 1;
			altAna += 0.03;
			altMaria += 0.02;
			
		}
		
		System.out.println("Altura Ana: " + altAna + "m" + "\nAltura Maria: " + altMaria + "m\nAnos: " + anos);

	}

}
