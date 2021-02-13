package java0;

public class Exswitchbreak1 {

	public static void main(String[] args) {
		
		char indice = 'b';
		
		String resultado = "";
		
		switch (indice) {
		
		case 'a':
		resultado +=  'a';
		break;
		
		case 'b':
		resultado += 'b';
		break;
		
		case 'c':
		resultado += 'c';
		break;
		
		default: 
		resultado += 'd';
		break;
		
		}
		System.out.println(resultado);
		
	}

}
