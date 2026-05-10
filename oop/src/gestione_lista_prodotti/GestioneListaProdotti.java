package gestione_lista_prodotti;

import java.util.Arrays;

/*
 * Esercizio: Gestione Lista Prodotti
Immagina di avere una lista di nomi di prodotti. Scrivi un programma che utilizzi le Stream API per:
Filtrare solo i prodotti che iniziano con la lettera "P".
Trasformare tutti i nomi in lettere maiuscole (toUpperCase).
Ordinare i risultati in ordine alfabetico.
Stampare ogni prodotto finale sulla console
Linea guida codice java:

prodotti.stream()
    .filter(p -> p.startsWith("P"))      // Filtra (tiene solo Pane, Pasta, Pizza)
    .map(String::toUpperCase)           // Trasforma in maiuscolo
    .sorted()                           // Ordina (PANE, PASTA, PIZZA)
    .forEach(System.out::println);      // Operazione terminale: stampa
Sfida Bonus 

Prova a modificare lo stream per contare quanti prodotti hanno un nome più lungo di 4 caratteri 
prima di filtrarli per la lettera "P" 
 */

public class GestioneListaProdotti {

	public static void main(String[] args) {

		String[] prodotti = { "Pane", "Pasta", "Pomodoro", "Frutta", "Verdura", "Mozzarella", "Prosciutto" };

		System.out.println("======GESTIONE LISTA PRODOTTI======");

		int count;

		// filtro per lettera P
		Arrays.stream(prodotti).filter(p -> p.startsWith("P")).forEach(System.out::println);
		System.out.println();

		// trasformo in maiuscolo
		Arrays.stream(prodotti).map(String::toUpperCase).forEach(System.out::println);
		System.out.println();

		// ordino alfabeticamente
		Arrays.stream(prodotti).sorted().forEach(System.out::println);
		System.out.println();

		// conta quanti prodotti hanno un nome più lungo di 4 caratteri
		count = (int) Arrays.stream(prodotti).filter(p -> p.length() > 4).count();

		System.out.println("Prodotti con nome più lungo di 4 caratteri: " + count);

	}

	/*
	 * Cosa è cambiato? Indipendenza: Poiché .count() restituisce un long (un valore
	 * singolo) e "consuma" lo stream, abbiamo creato un primo stream per il calcolo
	 * numerico. Riuso della sorgente: La lista prodotti (la sorgente) rimane
	 * intatta, quindi possiamo riaprire un secondo stream subito dopo per eseguire
	 * le trasformazioni e la stampa. Curiosità: Il metodo peek() Se volevi solo
	 * stampare a video i nomi lunghi mentre lo stream scorreva verso il filtro "P",
	 * avresti potuto usare .peek(p -> { if(p.length() > 4)
	 * System.out.println("Lungo: " + p); }). Tuttavia, peek si usa principalmente
	 * per il debugging e non per logiche di calcolo principali.
	 */
}