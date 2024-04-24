public class Ex_39 
{

	public static void main(String[] args) 
	{
		
		double grao, total = 0;
		
		for (int i = 0; i < 64; i++) 
		{
			grao = Math.pow(2, i);
			total += grao;
			System.out.print(grao + " ");
		}
		
		System.out.println("\nTotal de grãos: " + total);
		
	}

}
