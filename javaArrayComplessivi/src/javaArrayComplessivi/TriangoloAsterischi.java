package javaArrayComplessivi;

import java.io.*;

public class TriangoloAsterischi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Chiedi all'utente un numero intero n.
		 * Stampa un triangolo rettangolo di asterischi alto n righe. Esempio per n = 5:
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * Poi stampa anche il triangolo invertito (dalla riga più lunga alla più corta).
		 */
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		boolean valido = false;
		String dato;
		
		do
		{
			System.out.print("Inserisci un numero: ");
			try
			{
				dato = input.readLine();
				n = Integer.parseInt(dato);
				valido = true;
			}
			catch(Exception e)
			{
				System.out.println("Il dato inserito non è corretto, riprova");
			}
		}while(!valido);
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
