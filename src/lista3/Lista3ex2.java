package lista3;

import java.util.Scanner;

public class Lista3ex2 {

	public static void main(String[] args) {
		int numero, pares = 0, impares = 0;
		Scanner ler=new Scanner(System.in);
		
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		for(int x = 0;x < 10;x++) {
			System.out.print("Digite um n�mero: ");
			numero = ler.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			
		}
		System.out.printf("Pares s�o %d, e impares s�o %d", pares, impares);
		
	}

}
