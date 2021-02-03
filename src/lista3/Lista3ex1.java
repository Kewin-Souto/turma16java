package lista3;

public class Lista3ex1 {

	public static void main(String[] args) {

		System.out.println("Os restos na tabuada do 1000 ao 1999 são: ");

		for (int x = 1000; x <= 1999; x++) {

			if (x % 11 == 5) {
				System.out.println(x);
			}
 
		}

	}

}
