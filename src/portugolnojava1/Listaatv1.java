package portugolnojava1;

import java.util.Scanner;

public class Listaatv1 {

	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
	 *  meses e dias e mostre-a expressa apenas em dias. 
	 * 
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos , dias, meses, totalDias;

		
		
		System.out.println("Quantos anos você tem?");
		anos = leia.nextInt();
		 
		 System.out.println("E quantos meses?");
		meses = leia.nextInt();
		
		
		 System.out.printf("Sua idade em dias é " + totalDias);
		
		 anos = (totalDias * 365);
		meses = (totalDias % 365) *30;
		dias = (totalDias % 365) %30;
				 //totalDias = idadeAno * 365 + meses * 30 + dias;
		 /*
		  * 3 % 2 = 1
		  * 1 ano
		  * 1 mes 396 dias totais      
		  * 1 dia
		  * 
		  * totalDias % 365 = sobraDosMeses
		  * sobraDosMeses % 30 = dias
		  * 
		  * anos * 365
		  * meses * 30
		  * 
		  * 
		  * 
		  */
		
	}

}
