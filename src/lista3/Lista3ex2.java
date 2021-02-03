package lista3;

import java.util.Scanner;

public class Lista3ex2 {

	public static void main(String[] args) {
		int numero, pares = 0, impares = 0;
		Scanner ler=new Scanner(System.in);
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		for(int x = 0;x < 10;x++) {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			
		}
		System.out.printf("Pares são %d, e impares são %d", pares, impares);
		
	}

}
