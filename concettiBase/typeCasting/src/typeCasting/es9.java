package typeCasting;

public class es9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * crivi un programma Java che dichiara una 
		 *variabile di tipo double chiamata "numeroDecimale" 
		 *e una variabile di tipo String chiamata "numeroStringa". 
		 *Esegui un cast della variabile "numeroStringa" in double 
		 *e assegna il valore risultante alla variabile 
		 *"numeroDecimale". Stampa il valore della variabile "numeroDecimale".
		 */
		
		String numeroStringa = "10.5";
		double numeroDecimale = Double.valueOf(numeroStringa).doubleValue();
		System.out.println(numeroDecimale);
	}

}
