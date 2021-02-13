package java0;

public class Ifencadeamentoex {

	public static void main(String[] args) {
		int limiteCheque;
		int saldoMedio = 2500;
		if (saldoMedio > 5000) {
			
			limiteCheque = 1000;
			
		}else if (saldoMedio > 3000 && saldoMedio <= 5000)
		{
			limiteCheque = 800;
			
		}else if (saldoMedio > 2000 && saldoMedio <=3000) {
			
			limiteCheque = 600;
		}else if (saldoMedio > 100&& saldoMedio <= 2000) {
			
			limiteCheque = 400;
					
		}else {
			limiteCheque = 0;
			
		}
		System.out.println("Limite do cheque especial é " + limiteCheque);
	}
	

}
