package entidades;

public class Pessoa {
 
	public String nome;
	public char genero; 
	public int anoNascimento;
	
	 public int idade() 
	 { 
		 
		 	 return 2021 - anoNascimento;
	 }

	 public String statusIdade(){
			int idade;
			String aviso;
			
			idade = 2021 - anoNascimento;
			
			if(idade < 18) {
				aviso = "Voc� n�o pode comprar bebida alcolica!!";
			}
			else {
				aviso = "Aqui est� seu velho barreiro";
			}
			return aviso;
	 }
	 }


