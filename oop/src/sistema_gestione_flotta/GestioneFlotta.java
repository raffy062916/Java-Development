package sistema_gestione_flotta;

import java.util.ArrayList;
import java.util.List;

public class GestioneFlotta {

	public static void main(String[] args) {

		List<Veicolo> flotta = new ArrayList<>();

		flotta.add(new Veicolo("Fiat", "500", 50));
		flotta.add(new Veicolo("Fiat", "Panda", 45));
		flotta.add(new Veicolo("Fiat", "Golf", 55));
		flotta.add(new Veicolo("Fiat", "Giulia", 60));
		flotta.add(new Veicolo("Fiat", "Model 3", 65));

		System.out.println("======GESTIONE FLOTTA======");

		/*
		 * Nel Main, popola una lista di veicoli e usa le espressioni lambda per:
		 * 1-Stampare tutti i veicoli di marca "Fiat". 2-Stampare tutti i veicoli che
		 * costano meno di 50€ al giorno. 3-Stampare i veicoli il cui modello inizia con
		 * la lettera "G".
		 */

		// Stampa veicoli Fiat
		System.out.println("> Veicoli Fiat:");
		filtraVeicoli(flotta, v -> v.getMarca().equalsIgnoreCase("Fiat"));

		// Costo meno di 50 euro al giorno
		System.out.println("\n> Veicoli con prezzo minore di 50€:");
		filtraVeicoli(flotta, v -> v.getPrezzo() < 50.0);

		// Modello inizia con G
		System.out.println("\n> Veicoli con modello che inizia con G:");
		filtraVeicoli(flotta, v -> v.getModello().toUpperCase().startsWith("G"));
	}

	/*
	 * Crea un metodo statico filtraVeicoli(List<Veicolo> flotta, ValidatoreVeicolo
	 * criterio) che stampa solo i veicoli che soddisfano il criterio passato.
	 */

	public static void filtraVeicoli(List<Veicolo> flotta, ValidatoreVeicolo criterio) {

		for (Veicolo v : flotta) {
			if (criterio.test(v)) {
				System.out.println(v);
			}
		}
	}
}