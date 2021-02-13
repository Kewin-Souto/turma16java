package aulasDenilson;

import java.util.Scanner;

public class Lista1ex02 {

	
	 /* Exercício 2 – Monte um programa que peça ao usuário a sua altura e massa corporal
(peso). Após a leitura desses valores, deverá ser calculado o seu IMC (Índice de massa
corpórea). Para calcular utilize a seguinte fórmula IMC = peso[kg] / altura²(m). */
	
	
	
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
		System.out.println("o seu IMC é:" + imc);
	}

}
