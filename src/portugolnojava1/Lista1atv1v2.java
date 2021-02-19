package portugolnojava1;

import java.util.Scanner;

public class Lista1atv1v2 {

	public static void main ( String[]args) {
		
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
		 *  meses e dias e mostre-a expressa apenas em dias. */
		
		int mesDias = 30;
		int anoDias = 365;
		int anos;
		int meses;
		int  dias;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos anos em dias você tem?");
		System.out.println("\nAnos:");
		
		anos = leia.nextInt();
		
		System.out.println("\nMeses:");
		
		meses = leia. nextInt();
		
		System.out.println("\nDias:");
		
		dias = leia. nextInt();
		
		
		dias += (meses * mesDias) + (anos * anoDias);
		
		System.out.println("\nVocê já viveu em dias" + dias);
	}
	
	
}
