package testes;

import java.util.Scanner;

public class TesteJava {
	
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero:" );
		int valor = teclado.nextInt();
		linha(valor);
		linha(50);
		linha(40);
		linha(10);
		
		
		
	}
	
	public static void pula() {
		System.out.println();
		
	}
	
	public static void linha(int tamanho)
	{
		
		for (int x=1; x<=tamanho; x++) {
			System.out.print("-");
		}
		pula();
	}
	

}
