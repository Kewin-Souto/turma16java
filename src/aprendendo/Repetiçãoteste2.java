package aprendendo;

import java.util.Scanner;

public class Repetiçãoteste2 {

	
	private static final String Scanner = null;

	public static void main(String[]args) {
		 int n, s=0;
		String resp;	
		
			Scanner leia = new Scanner(System.in);
			
		 do {System.out.print("Digite um número: ");
		 n = leia .nextInt();
		 
			 s += n; // s = s +n
			 
			System.out.print("Quer continuar? [S/N] ");
			resp = leia.next();
		 }while (resp.equals("S"));
	System.out.println("A soma de todos os valores é "  + s);
	
	}
	
	
	
}