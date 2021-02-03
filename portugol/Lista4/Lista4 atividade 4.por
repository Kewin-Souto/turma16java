programa
{		// Questão 04
	//Crie um programa que receba valores do usuário para preencher uma 
	//matriz3X3,e em seguida,exiba a soma dos valores dela e a somados 
	//valores da primeira diagonal, ou seja, diagonal principal.
	funcao inicio()
	{
	inteiro valores[3][3]
	real somaValores = 0.0, somaDiagonal = 0.0
	

	
	
	 para (inteiro y=0; y<3; y++){
	 	para	(inteiro x=0; x<3; x++){
	 		
	escreva ("Qual valor gostaria de relatar?")
	leia(valores[y][x])
	 
	 somaValores += valores[y][x]
	 se (x == y)
	 {
	 	somaDiagonal = somaDiagonal + valores [y][x]
	 	
	 }
	 	}
	 }
  
	escreva ("A soma dos valores é", somaValores)
	escreva ("Mostrar para o usuário o valor da soma diagonal", somaDiagonal)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 8, 9, 7}-{somaValores, 9, 6, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */