package testes;

import java.util.Scanner;

public class testeex {
 
	public static void main(String [] args) {
		
		Scanner teclas = new Scanner(System.in);
		
		int numero;
		int x=0;
		
		
		
		do { 
			x++;
			System.out.print("Digite um numero: ");
			
			numero = teclas.nextInt();
		}while (x < 7);
		
		
	}
}
