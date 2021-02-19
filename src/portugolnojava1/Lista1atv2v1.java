package portugolnojava1;

import java.util.Scanner;

public class Lista1atv2v1 {

	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	public static void main(String[]args) {
		
		
		int anoDias ;
		int mesDias ; 
		int dias;
		 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o quantos dias em anos e meses acha que tem?");
		dias = leia.nextInt();
		
		anoDias=dias/365; 
		mesDias =( dias % 365)/ 30;
		dias=(dias % 360)% 30;
		
		System.out.println("\n A quantidade de dias inserido em anos é  "  + anoDias + " e em meses é "  + mesDias);
		
		
		
		
	}
}
