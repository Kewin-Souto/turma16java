programa
{
	inclua biblioteca Matematica
	
	
	funcao inicio()
	{
		real a, b, c, d, r, s

		escreva("Escreva o valor de a: ")
		leia(a)
		escreva("Escreva o valor de b: ")
		leia(b)
		escreva("Escreva o valor de c: ")
		leia(c)
		
		r = Matematica.potencia(a+b, 2)  
		s = Matematica.potencia(b+c, 2)  
		d = (r+s)/2
		
		escreva("Escreva o valor de d: "+d)
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */