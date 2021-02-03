package lista3;

import java.util.Scanner;

public class Lista3ex3 {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21
	 *  anos. Total de pessoas com mais de 50 anos. O programa termina quando idade
	 *  for =-99. (WHILE)
	*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, menores21 = 0, maiores50 = 0;
		while(idade != -99) {
			System.out.print("Qual sua idade: ");
			idade = ler.nextInt();
			if ( idade >= 50) {
				maiores50++;
			}
			if ( idade <= 21) {
				menores21++;
		
			}
			
		}
		System.out.printf("Maiores de 50 anos: %d", maiores50);
		
		System.out.printf("\nMenores de 21 anos: %d", menores21);
		
		
	}
	

}
	