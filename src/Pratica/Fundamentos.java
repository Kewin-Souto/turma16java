package Pratica;

public class Fundamentos {

	public static void main(String[] args) {
		
		String nome = "Kewin Souto Barros";
		int idade = 25;
		char sexo = 'M';
		double temperatura = 25.5;
		boolean tvLigada = false;
	
		System.out.println("Uso de  variáveis na linguagem Java");	
		System.out.println("Exemplos:");
		System.out.println("\nMeu nome é:" + nome);
		System.out.println("\nTenho:" + idade + "anos");
		System.out.println("\nE meu sexo é:" + sexo);
		System.out.println("\nAgora a temperatura é de " + temperatura);
		System.out.println(" \nA tv está ligada?" + tvLigada);
		System.out.println("_________________________________________");
		System.out.println("");
		double i =10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " +5 | i = " + (i+5));
		System.out.println("i = " + i + " -5 | i = " + (i-5));
		System.out.println("i = " + i + " *5 | i = " + (i*5));
		System.out.println("i = " + i + " /5 | i = " + (i/5));
		System.out.println("i = " + i + " %5 | i = " + (i%5));
		System.out.println("i += 5 	| i = " + (i += 5));
		System.out.println("i -= 5 	| i = " + (i -= 5));
		System.out.println("i *= 5 	| i = " + (i *= 5));
		i++;
		System.out.println("i++         | i = " +i );
		
		i--;
		System.out.println("i--         | i = " +i );
		
		System.out.println("_________________________________________");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE CONDICIONAL");
		System.out.println("");
		System.out.println("Exemplo01 uso do if");
		
		//quando a condição for a atribuida ele despreza a condição oposta
		if (sexo == 'M') {
			 System.out.println("Alistamento militar obrigatório!");
		}
		System.out.println("Exemplo02"+ " uso do if else");
		
		// neste exemplo o if else sempre tem que atribuir algo a condição oposta
		if (idade < 18) {
			 System.out.println("Menor de idade");
		} else {
	
		System.out.println("Maior de idade");}
		
		System.out.println("Exemplo03 uso do if");
		
		idade = 16;
		if (idade< 16) {
			 System.out.println("Proibido votar!");
		} else if ( idade >= 18 && idade <= 70) {
			System.out.println("Voto Obrigatório");
		}else// if (idade == 16 || idade == 17 || idade > 70)  se tirar essa parte da na mesma por tem apenas 3 condições e essa for a que resta
		{ 
			System.out.println("Voto Facultativo");}
		
		// funciona de maneira parecida com o else e busca e executa a variavel no default
		
		System.out.println("");
		System.out.println("Exemplo04 Uso do 'Switch case'");
		System.out.println(" 1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Relatórios");	
		int opcao = 3;
		 switch (opcao) {
		case 1:
			System.out.println("Cliente");
			break;
		case 2:
			System.out.println("Usuário");
			break;
			
		case 3:
			System.out.println("Relatórios");
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		
		 }
		 
		 
			System.out.println("");
			System.out.println("Estruturas de repetições");
			System.out.println("");
			System.out.println("Exemplo 5 - uso de 'for'");
			
			for(int j = 10; j > 0; j--) {
				
				
				System.out.println(j);
				
			}
			System.out.println("");
			System.out.println("Exemplo 6 - Tabuada");
			for (int tabuada = 0; tabuada <= 10; tabuada++){
				System.out.println("");
				for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
				System.out.println("");
				System.out.println("Exemplo 7 - uso da estrutura while");
				int contador = 1;
				while (contador <=10) {
					System.out.println(contador);
				contador++;
				}
					
				//  do while a unica diferença pro while é que ele vai executar uma vez a condição //independente de ser falsa
				
				System.out.println("");
				System.out.println("Exemplo 8/ - uso da estrutura do while");
				
				char novoJogo;
				do {
					System.out.println("Deseja jogar novamente (s/n)?");
					novoJogo = 'n';
				} while (novoJogo == 's');
				System.out.println("Game Over");
				
				
			}
			
		
		 
		 }
		 
	}
	
	
	
	
	


