package aulasDenilson;

import java.util.Scanner;

public class Lista01ex03 {
 
  /* Exerc�cio 3 � Monte um programa que leia um n�mero inteiro entre 1 e 12. Ap�s a
leitura, imprima o m�s condizente com o n�mero digitado, ou seja, caso o usu�rio
tenha entrado com o n�mero 3 dever� ser exibido �Mar�o�.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int mes;
		System.out.println("Digite um numero");
		mes = leia.nextInt();
		switch(mes){
		
		case 1: 
		System.out.println("Janeiro");
		break;
		
		case 2:
		System.out.println("Fevereiro");
		break;
		
		case 3:
		System.out.println("Mar�o");
		
		case 4:
		System.out.println("Abril");
		break;	
			
		case 5:
		System.out.println("Maio");
		break;	
			
		case 6:
		System.out.println("Junho");
		break;		
		
		case 7:
		System.out.println("Julho");
		break;	
			
		case 8:
		System.out.println("Agosto");
		break;		
		
		case 9:
		System.out.println("Setembro");
		break;		
		
		case 10:
		System.out.println("Outubro");
		break;		
			
			
		case 11:
		System.out.println("Novembro");
		break;		
				
		
		case 12:
		System.out.println("Dezembro");
		break;		
			
		default: System.out.println("inv�lido");
		
		}
	}

}
