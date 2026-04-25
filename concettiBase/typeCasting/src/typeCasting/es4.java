package typeCasting;

public class es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scrivi un programma Java che dichiara una variabile 
		 *di tipo String chiamata "numeroStringa" e una variabile 
		 *di tipo int chiamata "numeroIntero". Esegui un cast 
		 *della variabile "numeroStringa" in int e assegna il 
		 *valore risultante alla variabile "numeroIntero". 
		 *Stampa il valore della variabile "numeroIntero".
		 */
		
		String numeroStringa = "10";
		int numeroIntero = Integer.valueOf(numeroStringa).intValue();
		System.out.println(numeroIntero);
	}

}
