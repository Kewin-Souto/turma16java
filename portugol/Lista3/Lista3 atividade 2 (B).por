programa
{
	
	funcao inicio()
	{
		inteiro numero// variavel entrada são inserida pelo ususario
		inteiro soma=0//variavel saida são as que o codigo da ao usuario (é bom inicializar elas

		escreva("insira o numero: ") //pedir ao usuario o valor 
		leia(numero)		// ler o que o usuario vai escrever

	// O laço de repetição soma o valor do numero (ex. 7com a variavel som (ex. que se inicia em 0)
	//Após isso ele decrementa o valor do numero (ex. 7-1=6) e verifica se o valor é >= 0 (6> =0 ok)
	//Ele então repete o laço
	//



		faca		//inicio do laço de repetição
		
	{
		soma+=numero//Soma ataul recebe(=) soma anterior -numero
		numero--//Numero atual recebe(=) Numerar anterior -1
	
	}enquanto(numero>=0) // Condição para repetir o laço (repetir sempre que numero for >= a zero)

	escreva("\n",soma) // Escreva o valor do somatário
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */