package lavorareConNumeri;

import java.io.*;

public class es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Scrivi un programma Java che calcola 
		 *la potenza di un numero intero e stampa il risultato.
		 */
		/*
		 * int base = 2;
		 * int esponente = 5;
		 * int potenza = (int) Math.pow(base, esponente);
		 * System.out.println("La potenza è: " + potenza);
		 */
		
		//input da tastiera
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader inserimento = new BufferedReader(input);
		
		int base;
		int esponente;
		int potenza;
		String datoInserito;
		
		//inserimento base da tastiera
		System.out.print("Inserisci la base della potenza: ");
		try
		{
			datoInserito = inserimento.readLine();
			base = Integer.valueOf(datoInserito).intValue();
		}
		catch(Exception e)
		{
			System.out.println("\nIl dato inserito non è corretto");
			return;
		}
		
		//inserimento potenza da tastiera
		System.out.print("\nInserisci l'esponente della potenza: ");
		try
		{
			datoInserito = inserimento.readLine();
			esponente = Integer.valueOf(datoInserito).intValue();
		}
		catch(Exception e)
		{
			System.out.println("\nIl dato inserito non è corretto");
			return;
		}
		
		//calcolo potenza
		potenza = (int) Math.pow(base, esponente);
		
		//stampa della potenza
		System.out.println("\nLa potenza e' " + potenza);
	}

}
