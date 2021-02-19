package portugolnojava1;

import java.util.Scanner;

public class Lista1atv3v2 {

	/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 *
	 * horas, minutos, segundos, seg : inteiro
 inicio
    escreva(“Digite a duração do evento em segundos:”)
    leia(segundos)
    horas<-(segundos div 3600)
    minutos<-((segundos mod 3600) div 60)
    seg<-((segundos mod 3600) mod 60)
    escreva(“A duração do evento foi de”, horas,” horas”, minutos ,” minutos e”, seg ,” segundos”)
  fimalgoritmo
	 *
	 * */
	
	public static void main (String[] args) {
		
		int horas;
		int minutos;
		int segundos;
		int totalSegundos;
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.println("Digite a duração do evento em segundos: ");
		
		segundos = leia.nextInt(); 
		
		
		horas=(segundos/3600);
		minutos=(segundos%3600)/60;
		totalSegundos=(segundos%3600)%60;
		
		
		
		System.out.println("Tempo em horas: " + horas);
		
		System.out.println("Tempo em minutos: " +minutos);
		
		System.out.println("Tempo em segundos: " +segundos );
	
	
	
}
}