package aulasDenilson;

import java.util.Scanner;

public class Lista01ex01 {

	/*Exercício 1 – Escreva um programa que leia um determinado número inteiro
informado pelo usuário e exiba o resultado deste número elevado a 3. Por exemplo, se
a pessoa digitou o número 3, ao final deverá ser exibido o resultado 27. Dica: utilize o
método “pow()” da classe Math. Por exemplo: Math.pow(3,3); onde o primeiro valor é
a base e o segundo o expoente.

	 */
	public static void main(String[] args) {
	 
		//classe teclado serve para o usuario digitar no console.
	 Scanner teclado = new Scanner(System.in);
	
	 //variavéis
	 int metodo;		
	 double resultado;
	 
	
	 //Mostrar na tela o que está entre os parenteses e aspas.
	 System.out.println("\nInforme o número:");
	 
	 // aqui atribui o valor do usuario para o sistema, como era int se usa o nextInt.
	  metodo = teclado.nextInt();
	
	 //processamento.
	 resultado =  Math.pow(metodo,3);
	 
	 //printf exibe na tela porém formata a tela.
	 System.out.printf("O resultado é:\n %f", resultado);
	 
	 teclado.close();
	}

}
