package aulasDenilson;

import java.util.Scanner;

public class Lista01ex01 {

	/*Exerc�cio 1 � Escreva um programa que leia um determinado n�mero inteiro
informado pelo usu�rio e exiba o resultado deste n�mero elevado a 3. Por exemplo, se
a pessoa digitou o n�mero 3, ao final dever� ser exibido o resultado 27. Dica: utilize o
m�todo �pow()� da classe Math. Por exemplo: Math.pow(3,3); onde o primeiro valor �
a base e o segundo o expoente.

	 */
	public static void main(String[] args) {
	 
		//classe teclado serve para o usuario digitar no console.
	 Scanner teclado = new Scanner(System.in);
	
	 //variav�is
	 int metodo;		
	 double resultado;
	 
	
	 //Mostrar na tela o que est� entre os parenteses e aspas.
	 System.out.println("\nInforme o n�mero:");
	 
	 // aqui atribui o valor do usuario para o sistema, como era int se usa o nextInt.
	  metodo = teclado.nextInt();
	
	 //processamento.
	 resultado =  Math.pow(metodo,3);
	 
	 //printf exibe na tela por�m formata a tela.
	 System.out.printf("O resultado �:\n %f", resultado);
	 
	 teclado.close();
	}

}
