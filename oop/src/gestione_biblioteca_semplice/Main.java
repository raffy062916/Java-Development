package gestione_biblioteca_semplice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// creazione libreria
		ArrayList<Libro> libreria = new ArrayList<>();

		// creazione scanner
		Scanner input = new Scanner(System.in);

		// creazione variabili
		int scelta = 0;
		String titolo = null;
		String autore = null;
		int pagine = 0;
		double prezzo = 0.0;
		String risposta = null;

		// menu
		do {
			System.out.println("\n==========================================================");
			System.out.println("                BENVENUTO NELLA LIBRERIA                  ");
			System.out.println("==========================================================");
			String cornice = "-----------------------------------------------------------";
			System.out.println(cornice);
			// %-32s significa: scrivi una stringa, allineata a sinistra, occupando 32 spazi
			System.out.printf("| %-55s |\n", "1. Aggiungi libro");
			System.out.printf("| %-55s |\n", "2. Visualizza libreria");
			System.out.printf("| %-55s |\n", "3. Rimuovi libro");
			System.out.printf("| %-55s |\n", "4. Applica sconto");
			System.out.printf("| %-55s |\n", "5. Esci");
			System.out.println(cornice);

			scelta = Integer.parseInt(input.nextLine());

			switch (scelta) {
			case 1:
				System.out.println("\n==========================================================");
				System.out.println("                AGGIUNTA DI UN NUOVO LIBRO                ");
				System.out.println("==========================================================");

				System.out.print("> Titolo: ");
				titolo = input.nextLine();

				System.out.print("> Autore: ");
				autore = input.nextLine();

				System.out.print("> Pagine: ");
				pagine = Integer.parseInt(input.nextLine());

				System.out.print("> Prezzo: ");
				prezzo = Double.parseDouble(input.nextLine());

				System.out.print("> Ebook(s/n): ");
				risposta = input.nextLine().trim().toLowerCase();

				if (risposta.equals("s")) {
					System.out.print("> Formato: ");
					String formato = input.nextLine();
					Ebook ebook = new Ebook(titolo, autore, pagine, prezzo, formato);
					libreria.add(ebook);
				} else {
					Libro libro = new Libro(titolo, autore, pagine, prezzo);
					libreria.add(libro);
				}

				System.out.println("----------------------------------------------------------");
				System.out.println("              Libro salvato con successo!");
				System.out.println("----------------------------------------------------------");
				break;

			case 2:
				System.out.println("\n==========================================================");
				System.out.println("                STAMPA DELLA LIBRERIA                     ");
				System.out.println("==========================================================");
				if (libreria.isEmpty()) {
					System.out.println(" La libreria è vuota!");
					break;
				} else {
					for (Libro l : libreria) {
						System.out.println("| " + l.toString());
					}
				}
				break;

			case 3:
				System.out.println("\n==========================================================");
				System.out.println("                RIMOZIONE DI UN LIBRO                     ");
				System.out.println("==========================================================");
				System.out.print("> Titolo: ");
				String titoloRimuovere = input.nextLine();
				boolean trovato = false;

				// Scorriamo dall'ultimo elemento verso lo zero
				for (int i = libreria.size() - 1; i >= 0; i--) {
					if (libreria.get(i).getTitolo().equalsIgnoreCase(titoloRimuovere)) {
						libreria.remove(i); // Rimuove tramite indice
						trovato = true;
					}
				}

				if (trovato) {
					System.out.println("----------------------------------------------------------");
					System.out.println("            Rimozione avvenuta con successo!");
					System.out.println("----------------------------------------------------------");
				} else {
					System.out.println("----------------------------------------------------------");
					System.out.println("           Rimozione fallita, libro non trovato");
					System.out.println("----------------------------------------------------------");
				}
				break;

			case 4:
				System.out.println("\n==========================================================");
				System.out.println("                     APPLICA SCONTO                       ");
				System.out.println("==========================================================");
				System.out.print("> Titolo: ");
				String titoloSconto = input.nextLine();
				boolean libroTrovato = false;

				for (Libro l : libreria) {
					if (l.getTitolo().equalsIgnoreCase(titoloSconto)) {
						System.out.print("> Percentuale sconto: ");
						int percentuale = Integer.parseInt(input.nextLine());
						applicaSconto(l, percentuale);
						libroTrovato = true;
						System.out.println("----------------------------------------------------------");
						System.out.println("            Sconto applicato con successo!");
						System.out.println("----------------------------------------------------------");
						break;
					}
				}

				if (!libroTrovato) {
					System.out.println("----------------------------------------------------------");
					System.out.println("           Sconto fallito, libro non trovato");
					System.out.println("----------------------------------------------------------");
				}

				break;

			case 5:
				System.out.println("Arrivederci!");
				break;

			default:
				System.out.println("inserisci un valore valido (1-5)");
				break;
			}

		} while (scelta != 5);

		input.close();
	}

	public static void applicaSconto(Libro l, int percentuale) {
		if (percentuale >= 0 && percentuale <= 100) {
			double nuovoPrezzo = l.getPrezzo() * (1 - percentuale / 100.0);
			l.setPrezzo(Math.round(nuovoPrezzo * 100.0) / 100.0);
		} else {
			System.out.println("!!! Errore: Percentuale sconto non valida (deve essere 0-100).");
		}
	}
}