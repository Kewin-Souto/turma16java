package lista1javapoo;

public class TesteCliente {
	
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes 
	 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
	 *  objeto e apresente as informações deste objeto no console.
	 */
	
	public static void main (String []args) {
		 
		
		Cliente mufasa =  new Cliente();
		 
		mufasa.setIdentificacao(1);
		 
		mufasa.setPrimeiroNome("Cassius");
		 
		mufasa.setSegundoNome("Clay");
	
		mufasa.setTerceiroNome("Jhonson");
		 
		System.out.println(mufasa.getNomeCompleto());
	}

}
