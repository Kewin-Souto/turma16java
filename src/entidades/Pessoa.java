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
				aviso = "Você não pode comprar bebida alcolica!!";
			}
			else {
				aviso = "Aqui está seu velho barreiro";
			}
			return aviso;
	 }
	 }


