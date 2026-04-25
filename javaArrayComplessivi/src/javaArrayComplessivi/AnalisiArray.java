package javaArrayComplessivi;

import java.io.*;

public class AnalisiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un array di int con almeno 12 elementi (sia positivi che negativi).
		 * Scrivi il codice per calcolare e stampare:
		 * • Il valore minimo e il valore massimo.
		 * • La somma e la media di tutti gli elementi.
		 * • La somma dei soli numeri positivi e la somma dei soli negativi.
		 * Non usare metodi di librerie esterne: fai tutto con cicli e variabili d'appoggio
		 */
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
		int numeri[] = new int[12], i = 0, min, max, sommaPositivi = 0, sommaNegativi = 0, somma = 0;
		double media = 0;
		String dato, mex;
		
		//input
		
		do
		{
		    System.out.print("Inserisci il " + (i+1) + " numero: ");
		    try
		    {
		        dato = input.readLine();
		        numeri[i] = Integer.valueOf(dato).intValue();
		        i++;
		    }
		    catch(Exception e)
		    {
		        System.out.println("Il dato inserito non è corretto, riprova");
		    }
		} while(i < numeri.length);
		
		min = numeri[0];
		max = min;
		
		//stampa array e calcolo
		for(i = 0; i < numeri.length; i++)
		{
			System.out.print(numeri[i] + " ");
			if(min > numeri[i])
				min = numeri[i];
			if(max < numeri[i])
				max = numeri[i];
			somma += numeri[i];
			
			if(numeri[i] >= 0)
				sommaPositivi += numeri[i];
			else
				sommaNegativi += numeri[i];
		}
		
		media = (double)somma/numeri.length;
		
		mex = String.format("\nMin: %d"
				+ "\nMax: %d"
				+ "\nSomma: %d"
				+ "\nMedia: %.3f"
				+ "\nSomma positivi: %d"
				+ "\nSomma negativi: %d", min, max, somma, media, sommaPositivi, sommaNegativi);
		
		System.out.println(mex);
		
	}

}
