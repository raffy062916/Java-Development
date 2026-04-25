package javaArrayComplessivi;

import java.io.*;

public class OrdinamentoManuale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un array di int con almeno 8 elementi in ordine casuale.
		 * Implementa l'algoritmo Bubble Sort per ordinare l'array in ordine crescente.
		 * Ad ogni passata completa dell'algoritmo, stampa lo stato corrente dell'array in modo da
		 * visualizzare come procede l'ordinamento passo dopo passo.
		 * Alla fine stampa l'array ordinato e il numero totale di scambi effettuati
		 */

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int numeri[] = new int[8]; 
		int i = 0, temp = 0;
		boolean scambiato;
		String dato;
		
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
		
		do
		{
			scambiato = false;
			
			for(i = 0; i < numeri.length-1; i++)
			{
				if(numeri[i] > numeri[i+1])
				{
					temp = numeri[i];
					numeri[i] = numeri[i+1];
					numeri[i+1] = temp;
					scambiato = true;
				}
			}
			
			for(i = 0; i < numeri.length; i++)
		    {
		        System.out.print(numeri[i] + " ");
		    }
		    System.out.println();
			
		}while(scambiato);
		
		for(i = 0; i < numeri.length; i++)
		{
			System.out.print(numeri[i] + " ");
		}
		
	}

}
