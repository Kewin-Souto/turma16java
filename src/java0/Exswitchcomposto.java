package java0;

public class Exswitchcomposto {

	public static void main(String[] args) {
			
		String resultado = "";
		
		int valor = 11;
		
		switch (valor) {
		
		
			
		case 12:
			resultado = "Excelente";
			break;
			
		case 11:
			resultado = "Otimo";
			break;
			
		case 10:
			resultado = "Muito bom";
			break;
			
			
		case 9:
			resultado = "Bom";
			break;
		
		case 8:
			resultado = "Satisfatorio";
			break;
			
			
		case 7:
			resultado = "Baixo";
			break;
		
		case 6:
			resultado = "Muito Baixo";
			break;
			
			
		default:
		resultado = "Insatisfatório";
		}
		
		System.out.println("Resultado km/1: " +valor+ "="+ resultado);
	}

}
