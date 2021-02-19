package portugolnojava1;

import java.util.Scanner;

public class Lista1atv8v1 {
	/*
8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor
 e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% 
 e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
  consumidor. */

	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoCarro;
		double custoFabrica = 72.0 * 10.0; 
		double porceDistribuidor = 28.0 * 10.0;
		double impostos = 45.0 * 10.0;
		 
		System.out.println("Qual custo do carro?");
		custoCarro = leia.nextDouble();
		
	
		custoCarro = ((custoFabrica - impostos) + porceDistribuidor);
		
		System.out.println("O custo de fábrica do carro é: " + custoFabrica);
		
		System.out.println("A percetagem do distribuidor: " + porceDistribuidor);
		
		System.out.println("Os impostos sobe o custo de fábrica são: " + impostos);
	}

}