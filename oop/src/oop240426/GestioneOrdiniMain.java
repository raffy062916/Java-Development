package oop240426;

/*
 * Un ristorante vuole digitalizzare la gestione degli ordini. Ogni tavolo può avere un solo ordine
 * attivo alla volta. L'ordine raccoglie le pietanze scelte dai clienti, ognuna con il proprio prezzo. Il
 * sistema deve permettere di aggiungere e rimuovere pietanze, calcolare il totale (con
 * l'applicazione facoltativa del coperto), e chiudere l'ordine quando il tavolo paga.
 * 
 * Cosa deve fare il programma:
 * • Rappresentare una singola pietanza con nome, categoria (antipasto, primo, secondo,
 *   dolce, bevanda) e prezzo.
 * • Rappresentare un ordine associato a un numero di tavolo. L'ordine contiene un elenco di
 *   pietanze e tiene traccia del proprio stato: aperto o chiuso.
 * • Permettere di aggiungere pietanze a un ordine aperto. Non deve essere possibile
 *   aggiungere pietanze a un ordine già chiuso.
 * • Permettere di rimuovere una pietanza dall'ordine specificandone il nome.
 * • Calcolare il totale dell'ordine. Il coperto (un importo fisso per persona) va sommato al
 *   totale solo se il ristorante lo prevede: il numero di coperti deve essere indicato al momento
 *   della creazione dell'ordine.
 * • Chiudere l'ordine, impedendo ulteriori modifiche e stampando un riepilogo leggibile con
 *   l'elenco delle pietanze, il subtotale, l'eventuale coperto e il totale finale.
 * • Gestire un insieme di tavoli (almeno 5). Per ogni tavolo si deve poter creare un nuovo
 *   ordine, lavorarci, e chiuderlo. Il programma principale deve simulare almeno due tavoli con
 *   ordini diversi.
 * 
 * Vincoli e suggerimenti:
 * Utilizzare almeno due classi distinte. I dati devono essere protetti da accesso diretto esterno. Il
 * programma deve funzionare interamente da console, senza interazione da tastiera: i dati di test
 * vanno scritti direttamente nel codice.
 */

public class GestioneOrdiniMain {

	public static void main(String[] args) {

		Pietanza p1 = new Pietanza("Pasta e patate", Pietanza.Categoria.PRIMO, 5.0);
		Pietanza p2 = new Pietanza("Pasta alla Carbonara", Pietanza.Categoria.PRIMO, 10.0);
		Pietanza p3 = new Pietanza("Bistecca", Pietanza.Categoria.SECONDO, 15.0);
		Pietanza p4 = new Pietanza("Tiramisù", Pietanza.Categoria.DOLCE, 6.0);
		Pietanza p5 = new Pietanza("Acqua", Pietanza.Categoria.BEVANDA, 3.0);

		// Tavolo 1
		Ordine[] tavolo = new Ordine[6];
		tavolo[1] = new Ordine(1, 2, 5.0);
		tavolo[1].aggiungiPietanza(p1);
		tavolo[1].aggiungiPietanza(p2);
		tavolo[1].aggiungiPietanza(p5);

		tavolo[2] = new Ordine(2, 1, 0.0);
		tavolo[2].aggiungiPietanza(p1);
		tavolo[2].aggiungiPietanza(p4);
		tavolo[2].aggiungiPietanza(p5);

		tavolo[1].rimuoviPietanza("Pasta alla Carbonara");

		tavolo[1].chiudiEStampaScontrino();
		tavolo[2].chiudiEStampaScontrino();
	}

}