package aprendendo;

public class Exestruturarepetição {

	public static void main(String[] args) {
		
		int cc = 1;
		while (cc<=20) {
			cc++;
			if (cc == 5 || cc == 7) {
				continue;
			}
			if (cc ==7) {
				 break;
			}
			System.out.println("\nCambalhota" + cc);
		}
	}

	}

