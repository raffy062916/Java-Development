package formattazioneStringhe;

import java.util.Scanner;

public class esComplessivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Esercizio 1
		 * Scrivi un programma Java che stampa la lunghezza di una stringa.
		 * Esercizio 2
		 * Scrivi un programma Java che converte una stringa in maiuscolo.
		 * Esercizio 3
		 * Scrivi un programma Java che verifica se una stringa inizia con un determinato prefisso.
		 * Esercizio 4
		 * Scrivi un programma Java che verifica se una stringa termina con un determinato suffisso.
		 * Esercizio 5
		 * Scrivi un programma Java che converte un intero in una stringa utilizzando il metodo valueOf.
		 * Esercizio 6
		 * Scrivi un programma Java che concatena due stringhe utilizzando l'operatore +.
		 * Esercizio 7
		 * Scrivi un programma Java che estrae una sottostringa da una stringa.
		 * Esercizio 8
		 * Scrivi un programma Java che verifica se una stringa contiene una determinata sequenza di caratteri utilizzando il metodo contains.
		 * Esercizio 9
		 * Scrivi un programma Java che utilizza l'interpolazione di stringhe per combinare una variabile con una stringa.
		 * Esercizio 10
		 * Scrivi un programma Java che rimuove gli spazi bianchi da una stringa utilizzando il metodo trim.
		 */
		
		Scanner input = new Scanner(System.in);
		String stringa, stringa2, conc, sottos, maiusc, prefisso, suffisso, cont, mex, fraseSpazi, fraseSenzaSpazi, finale;
		int lunghezza;
		boolean isPrefisso, isSuffisso, isContenuto;
		
		//input stringa
		System.out.print("Inserisci stringa: ");
		stringa = input.next();
		System.out.print("Inserisci la seconda stringa: ");
		stringa2 = input.next();
		
		//assegnazione
		prefisso = "Raf";
		suffisso = "ele";
		cont = "ael"; 
		fraseSpazi = "   Quanti anni hai?    ";
		
		//calcolo
		lunghezza = stringa.length();
		maiusc = stringa.toUpperCase();
		isPrefisso = stringa.startsWith(prefisso);
		isSuffisso = stringa.endsWith(suffisso);
		conc = stringa + stringa2;
		sottos = stringa.substring(1, lunghezza-1);
		isContenuto = stringa.contains(cont);
		fraseSenzaSpazi = fraseSpazi.trim();
		finale = fraseSpazi.replace(" ", "");
		mex = String.format("\nLa stringa inserita e' %s"
				+ "\nLa Lunghezza e' %d", stringa, lunghezza);
		
		//stampa della stringa e lunghezza sostituiti dalla varibile mex
		//System.out.println("\nLa stringa inserita e' " + stringa);
		//System.out.println("La Lunghezza e' " + lunghezza);
		//stampa
		System.out.println(mex);
		System.out.println("In maiuscolo e' " + maiusc);
		System.out.println("IsPrefisso e' " + isPrefisso);
		System.out.println("IsSuffisso e' " + isSuffisso);
		System.out.println("IsContenuto e' " + isContenuto);
		System.out.println("La seconda stringa inserita e' " + stringa2);
		System.out.println("La stringa concatenata e' " + conc);
		System.out.println("La sottostringa e' " + sottos);
		System.out.println("La frase originale e' " + fraseSpazi);
		System.out.println("La frase trim e' " + fraseSenzaSpazi);
		System.out.println("La frase senza spazi e' " + finale);
	}

}
