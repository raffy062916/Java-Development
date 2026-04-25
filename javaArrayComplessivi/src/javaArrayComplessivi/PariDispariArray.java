package javaArrayComplessivi;

public class PariDispariArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un array di int con almeno 10 elementi a tua scelta.
		 * Scorri l'array con un ciclo for-each e conta quanti numeri sono pari e quanti dispari.
		 * Alla fine stampa entrambi i conteggi.
		 */
		
		int numeri[];
		int pari=0, dispari=0;
		
		numeri = new int[10];
		
		for(int i = 0; i < numeri.length; i++)
		{
			numeri[i] = (int)(Math.random()*10);
			System.out.print(numeri[i] + " ");
		}
		
		for(int num : numeri) 
		{
			if(num%2==0)
				pari++;
			else
				dispari++;
		}
		
		System.out.println("\nNumeri pari: " + pari + "\nNumeri dispari: " + dispari);
	}

}
