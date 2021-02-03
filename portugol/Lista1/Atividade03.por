programa
{
	
	funcao inicio()
	{


	
	inteiro Horas
	inteiro minutos
	inteiro segundos
	inteiro totalsegundos

	escreva("Quantos segundos você deseja converter?")
	
	leia(totalsegundos)

	Horas = totalsegundos / 3600
	minutos = (totalsegundos % 3600) /60
	segundos = (totalsegundos % 3600) %60


	escreva("o evento durou: "+Horas+"Horas, "+minutos+"minutos, "+segundos+"segundos")
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */