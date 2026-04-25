package javaArrayComplessivi;

import java.io.*;

public class IndovinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dichiara una variabile int come numero segreto (hardcodato, es. 42).
		 * Usando un ciclo do-while, simula un gioco in cui l'utente deve indovinare il numero.
		 * Ad ogni tentativo stampa se il numero inserito è troppo alto o troppo basso.
		 * Quando l'utente indovina, stampa il numero di tentativi impiegati.
		 */
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int numeroSegreto, numeroUtente, tentativo;
		String dato;
		
		numeroSegreto = (int)(Math.random()*100);
		tentativo = 0;
		numeroUtente = 0;
		
		do 
		{
			System.out.print("Inserisci un numero: ");
			try
			{
				dato = input.readLine();
				numeroUtente = Integer.valueOf(dato).intValue();
				tentativo++;
			}
			catch(Exception e)
			{
				System.out.println("Il dato inserito non è corretto");
			}
			
			if(numeroUtente>numeroSegreto)
				System.out.println("Il numero inserito è troppo alto");
			else if(numeroUtente<numeroSegreto)
				System.out.println("Il numero inserito è troppo basso");
			else
				System.out.println("Hai indovinato! Il numero era: " + numeroSegreto + ". Tentativi impiegati: " + tentativo);
		}while(numeroUtente!=numeroSegreto);
		
	}

}
