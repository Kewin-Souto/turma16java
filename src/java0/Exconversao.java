package java0;

public class Exconversao {
	
public static void main(String []args) {
	
	System.out.println("\n*** Recomenda-se nao acentuar as palavras! ***");
	System.out.println("\n===================================================================);");
	String v1 = "Sistema";
	String v2 = new String("sistema");
	 
	//equals
	System.out.println("Exemplo com metodo de comparacao: equals");
	if (v1.equals(v2))
			
	
			{System.out.println("variaveis Identicas => " + " v1: "+ v1 + " v2: "+ v2);}
	
	else
		
			{System.out.println("variaveis Diferentes => " + " v1: "+ v1 + " v2: "+ v2);}
	
	System.out.println ("\n==================================================================");
	
	//equals ignoreCase
	
	System.out.println ("Exemplo sem o metodo de comparacao; equalsIgnoreneCase");
	if(v1.equalsIgnoreCase(v2))
		
			{System.out.println("variaveis Identicas => " + " v1: "+ v1 + " v2: "+ v2);}
	
	else
		
			{System.out.println("variaveis Diferentes => " + " v1: "+ v1 + " v2: "+ v2);}
	
	System.out.println("\n=====================================================================");
	//Alguns metodos
	//indezof, charAt, substring
	System.out.println("Exemplos com metodos: indexOf, substring, charAt");
	String frase = "Desenvolvimento de Sistemas";
	System.out.println("\nFrase-Exemplo => Desenvolvimento de sistemas");
	System.out.println("\nindexof => Posicao da fonte <a> na Frase-Exemplo (0 a 26 e com os espacos): "+frase.charAt(5));
	
	System.out.println("\n=====================================================================");
	//concat
	String titulo1 = "Desenvolvimento ", titulo2 = "de sistemas";
	String cursoCompleto = titulo1.concat(titulo2);
	System.out.println("\ntitulo 1: "+ titulo1);
	System.out.println("titulo 2: " + titulo2);
	System.out.println("Exemplo concatenado => titulo 1 + titulo 2 = " + cursoCompleto);
}

}
