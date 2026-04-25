package javaArrayComplessivi;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Usando un ciclo for, stampa i numeri da 1 a 50 con le seguenti regole:
		 * • Se il numero è divisibile per 3, stampa "Fizz" al posto del numero.
		 * • Se è divisibile per 5, stampa "Buzz".
		 * • Se è divisibile sia per 3 che per 5, stampa "FizzBuzz".
		 * • Altrimenti stampa il numero stesso.
		 */
		
		for(int i=1; i<=50; i++) 
		{
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}

}
