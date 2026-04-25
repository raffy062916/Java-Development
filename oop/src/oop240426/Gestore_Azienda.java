package oop240426;

import java.util.ArrayList;
/*
 * Contesto
 * Una piccola azienda necessita di un sistema per registrare gli ingressi e le uscite giornaliere dei
 * propri dipendenti. Ogni dipendente ha un codice identificativo, un nome e un reparto di
 * appartenenza. Il sistema deve calcolare le ore lavorate nella giornata e segnalare eventuali
 * anomalie (ad esempio, un'uscita registrata senza un ingresso precedente).
 * 
 * Cosa deve fare il programma
 * • Rappresentare un dipendente con codice univoco, nome completo e reparto.
 * • Rappresentare una timbratura, che contiene l'orario (espresso in ore e minuti) e il tipo:
 *   ingresso o uscita.
 * • Ogni dipendente accumula le proprie timbrature della giornata. Il sistema deve accettare
 *   timbrature solo se coerenti: non si può registrare un ingresso se l'ultimo evento è già un
 *   ingresso, e viceversa.
 * • Calcolare il totale delle ore lavorate nella giornata per un singolo dipendente. Il calcolo si
 *   basa sulle coppie ingresso-uscita completate. Se l'ultima timbratura è un ingresso senza
 *   uscita, quella sessione non va conteggiata ma va segnalata.
 * • Produrre un riepilogo giornaliero per l'intera azienda: per ciascun dipendente mostrare il
 *   nome, il reparto, il numero di ore lavorate e se ci sono sessioni incomplete.
 * • Il programma principale deve simulare una giornata con almeno 4 dipendenti appartenenti
 *   ad almeno 2 reparti diversi, con situazioni miste (giornate regolari e almeno un caso di
 *   sessione incompleta).
 * 
 * Vincoli e suggerimenti
 * Gli orari possono essere gestiti semplicemente come coppie di numeri interi (ore, minuti),
 * senza ricorrere a librerie per date e orari. Utilizzare almeno due classi. L'output deve essere
 * chiaro e ordinato per reparto.
 */
import java.util.List;

public class Gestore_Azienda {

	public static void main(String[] args) {

		// 1. Creiamo la lista dell'azienda
		List<Dipendente> azienda = new ArrayList<>();

		// 2. Creiamo 4 dipendenti in 2 reparti
		Dipendente d1 = new Dipendente(101, "Mario Rossi", "Produzione");
		Dipendente d2 = new Dipendente(102, "Luigi Bianchi", "Produzione");
		Dipendente d3 = new Dipendente(201, "Anna Verdi", "Amministrazione");
		Dipendente d4 = new Dipendente(202, "Paolo Neri", "Amministrazione");

		// 3. Simuliamo le timbrature

		// CASO 1: Mario - Giornata regolare (8 ore)
		d1.timbra(8, 0, true); // Ingresso
		d1.timbra(12, 0, false); // Uscita pranzo
		d1.timbra(13, 0, true); // Rientro
		d1.timbra(17, 0, false); // Uscita finale

		// CASO 2: Luigi - ANOMALIA (Dimentica l'uscita)
		d2.timbra(8, 30, true); // Ingresso
		// Si dimentica di timbrare l'uscita!

		// CASO 3: Anna - Giornata breve (4.5 ore)
		d3.timbra(9, 0, true);
		d3.timbra(13, 30, false);

		// CASO 4: Paolo - Errore di timbratura (doppio ingresso)
		d4.timbra(8, 0, true);
		d4.timbra(8, 5, true); // Questo genererà l'errore che abbiamo scritto nel metodo timbra()

		// Aggiungiamo i dipendenti alla lista
		azienda.add(d1);
		azienda.add(d2);
		azienda.add(d3);
		azienda.add(d4);

		// 4. Ordinamento per reparto (richiesto dal testo)
		azienda.sort((a, b) -> a.getReparto().compareTo(b.getReparto())); // lambda expression
		/*
		 * Bubble sort implementation to sort by department without lambda expressions
		 * for (int i = 0; i < azienda.size() - 1; i++) { for (int j = 0; j <
		 * azienda.size() - 1 - i; j++) { if
		 * (azienda.get(j).getReparto().compareTo(azienda.get(j + 1).getReparto()) > 0)
		 * { Dipendente temp = azienda.get(j); azienda.set(j, azienda.get(j + 1));
		 * azienda.set(j + 1, temp); } } }
		 */

		// 5. Produzione del riepilogo
		System.out.println("\n--- RIEPILOGO GIORNALIERO AZIENDALE ---");
		System.out.printf("%-15s | %-15s | %-10s | %-25s\n", "NOME", "REPARTO", "ORE", "ANOMALIE");
		System.out.println("------------------------------------------------------------------");

		for (Dipendente d : azienda) {
			String infoAnomalia = d.getDescrizioneAnomalia();

			System.out.printf("%-15s | %-15s | %-10.2f | %-25s\n", d.getNome(), d.getReparto(), d.calcoloOreTotali(),
					infoAnomalia);
		}
	}
}
