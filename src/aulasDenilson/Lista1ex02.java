package aulasDenilson;

import java.util.Scanner;

public class Lista1ex02 {

	
	 /* Exerc�cio 2 � Monte um programa que pe�a ao usu�rio a sua altura e massa corporal
(peso). Ap�s a leitura desses valores, dever� ser calculado o seu IMC (�ndice de massa
corp�rea). Para calcular utilize a seguinte f�rmula IMC = peso[kg] / altura�(m). */
	
	
	
	public static void main(String[] args) {
		
		// atribuicoes
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		double peso, altura, imc=0;
		
		//pergunta ao usuario 
		System.out.println("Qual seu peso?");
		peso = leia.nextDouble();
		
		//pergunta ao usuario
		System.out.println("Qual sua altura?");
		altura = leia.nextDouble();
		
		//processamento
		//imc = peso/ Math.pow(altura,2); ex de possivel uso, com comando automatico.
		imc = peso/ (altura*altura);
		
		//resultado
		System.out.println("o seu IMC �:" + imc);
	}

}
