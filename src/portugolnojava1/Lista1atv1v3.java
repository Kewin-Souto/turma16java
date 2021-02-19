package portugolnojava1;

import java.util.Scanner;

public class Lista1atv1v3 {
	
	public static void main(String[] args) {
		
	    byte diasMes = 30;
		short diasAnos = 365;
		short dias;
		byte meses;
		byte anos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPronto para descobrir seus anos em dias: ");
		
		System.out.println("\nQuantos anos tem?");
		anos = leia.nextByte();
		
		System.out.println("\nQuantos meses tem?");
		meses = leia.nextByte();
		
		System.out.println("\nQuantos dias?");
		dias = leia.nextShort();
		
		dias += (meses * diasMes) + (anos * diasAnos);
		
		System.out.println("\nVocê em dias" + dias);
	}

}
