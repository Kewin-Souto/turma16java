package portugolnojava1;

import java.util.Scanner;

public class Lista1atv6v1 {
	/*. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
	 * P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula 
	 * d=raiz quadrada de (x2-x1)� + (y2-y1)�
	 */

	public static void main(String[]args) {
	Scanner leia = new Scanner(System.in);
		
		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		
		
		System.out.println("Escreva o valor de x1");
		x1=leia.nextDouble();
		

		System.out.println("Escreva o valor de x2");
		x2=leia.nextDouble();
		

		System.out.println("Escreva o valor de y1");
		y1=leia.nextDouble();
		

		System.out.println("Escreva o valor de y2");
		y2=leia.nextDouble();
		

		d=Math.sqrt((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		
		System.out.println("A dist�ncia entre os pontos P1 e P2 �: "+d);
				
				
			
				
	}
}
