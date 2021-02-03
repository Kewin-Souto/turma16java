package lista1javapoo;

public class Cliente {

	public	String primeiroNome;
	
	public	String segundoNome;
	
	public   String terceiroNome;
	
	public int identificacao;
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome+" "+segundoNome+" "+terceiroNome;
		
		return nomeCompleto;
	}
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getTerceiroNome() {
		return terceiroNome;
	}

	public void setTerceiroNome(String terceiroNome) {
		this.terceiroNome = terceiroNome;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	

}
