package portugolnojava1;

import java.util.Scanner;

public class Lista1atv04v1 {
	
	
	
	/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a 
	 * seguinte express�o:   D=R+S 		R=(A+B)�� 
							   2  onde  S=(B+C)��
	 * 
	 */
		
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		double A ;
		double B ;
		double C ;
		double D ;
		double R ;
		double S ;
		
		System.out.println("Atribua o valor de A ");
		A = leia.nextDouble();
		
		
		System.out.println("Atribua o valor de B ");
		B = leia.nextDouble();
		
		
		System.out.println("Atribua o valor de C ");
		C = leia.nextDouble();
		
		R =Math.pow(A+B, 2); 
		S = Math.pow(B+C, 2) ;
		D = (R+S)/2;
		
		System.out.println("O valor de D � igual a " +D);
		
		
	}
}
