programa
{
	inclua biblioteca Matematica
		funcao inicio()
	{
		real x1, x2, y1, y2, d

		escreva("Escreva o valor de x1: ")
		leia(x1)
		escreva("Escreva o valor de y1: ")
		leia(y1)
		escreva("Escreva o valor de x2: ")
		leia(x2)
		escreva("Escreva o valor de y2: ")
		leia(y2)
		
		d = Matematica.raiz((Matematica.potencia(x2-x1, 2)+Matematica.potencia(y2-y1, 2)), 2)
		escreva("A distancia entre os pontos P1 e P2 é: "+d)
	}

		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */