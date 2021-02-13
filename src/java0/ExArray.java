package java0;

public class ExArray {

	public static void main(String[] args) {
	
		double[] [] notas = new double [2] [4];
		
		notas[0] [0] = 8.0;
		notas[0] [1] = 7.5;
		notas[0] [2] = 9.0;
		notas[0] [3] = 8.5;
		notas[1] [0] = 9.5;
		notas[1] [1] = 8.5;
		notas[1] [2] = 8.0;
		notas[1] [3] = 9.0;
		
		System.out.println("\n");
		// 1 = indice das linhas [2]
		//2 = indice das colunas [4]
	
	for(int l=0; l<notas[l].length; l++) {
		for(int c=0; c<notas[l].length; c++) {
			
			
			System.out.println(l + "e" + c +" = "+ notas[l] [c] + "/t)");
			
			// print  imprime sem a quebra de linha 
		}
			System.out.println("\n");
			// println imprime com a quebra de linha 
		}
		
	}
	

}
