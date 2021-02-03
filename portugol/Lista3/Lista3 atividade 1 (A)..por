 programa {
 
 	
 
 funcao inicio ()
	{
		real salario, numeroFilhos, mediaSalario=0.0, mediaFilhos=0.0, salario100=0.0, maiorSalario=0.0
		
		para(inteiro i=0;i<20;i++)
		{
			escreva("\nInsira o salario do cidadão ",i,": ")
			leia(salario)
		
			escreva("\nInsira a quantidade de filhos do cidadão ",i,": ")
			leia(numeroFilhos)
			
			mediaSalario = mediaSalario + salario
			mediaFilhos += numeroFilhos
			
			se(salario <= 100)
			{
				salario100 += 1 
			}
			
			se(i>0)
			{
				se(salario > maiorSalario)
				{
					maiorSalario = salario
				}
			}
		}

		escreva("\nA media de salario da população é: "+(mediaSalario/20))
		escreva("\nA media do numero de filhos da população é: "+(mediaFilhos/20))
		escreva("\nO maior salario da população é: "+maiorSalario)
		escreva("\nO percentual de pessoas com salario até 100 é: "+(salario100*100/20)+"%")
	}
	
}
	
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */