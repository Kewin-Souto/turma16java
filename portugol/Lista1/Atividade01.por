programa
{
	
	funcao inicio()
	{
		//programa-objetivo
		//inicio
		//variaveis
		//entradas
		//processamentos
		//saidas
		//fim
		//
// variaveis
	inteiro idadePessoa, anos, meses, dias

	//entradas
	escreva("Digite a quantidade total em dias da pessoa:")
	leia(idadePessoa)

	//processamento 
	anos = (idadePessoa / 365)
	meses = (idadePessoa % 365) / 30
	dias = (idadePessoa % 365) % 30
	//teste
	escreva("Total de anos: "+anos)
	escreva("Total em meses:"+meses)
	escreva("\nTotal em dia (s):"+dias)

	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */