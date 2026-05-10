package registro_presenze_dipendenti;

import java.util.ArrayList;
import java.util.List;

public class RiepilogoGiornaliero {
	private final List<Dipendente> dipendenti = new ArrayList<>();

	public void aggiungiDipendente(Dipendente d) {
		dipendenti.add(d);
	}

	public void stampaRiepilogo() {
		// Creiamo una copia della lista per non alterare l'ordine originale
		List<Dipendente> ordinati = new ArrayList<>(dipendenti);

		// Bubble Sort (Ordinamento manuale per Reparto e poi Nome)
		for (int i = 0; i < ordinati.size() - 1; i++) {
			for (int j = 0; j < ordinati.size() - 1 - i; j++) {
				Dipendente d1 = ordinati.get(j);
				Dipendente d2 = ordinati.get(j + 1);

				int compReparto = d1.getReparto().compareTo(d2.getReparto());
				boolean scambia = false;

				if (compReparto > 0) {
					scambia = true;
				} else if (compReparto == 0) {
					if (d1.getNome().compareTo(d2.getNome()) > 0) {
						scambia = true;
					}
				}

				if (scambia) {
					ordinati.set(j, d2);
					ordinati.set(j + 1, d1);
				}
			}
		}

		System.out.println("\n--- RIEPILOGO GIORNALIERO ---");
		String repartoCorrente = "";

		for (int i = 0; i < ordinati.size(); i++) {
			Dipendente d = ordinati.get(i);

			if (!d.getReparto().equals(repartoCorrente)) {
				repartoCorrente = d.getReparto();
				System.out.println("\n  ▶ Reparto: " + repartoCorrente);
			}
			System.out.println(d.riepilogo());
		}

		// Conteggio manuale (Sostituisce lo Stream)
		int contaIncompleti = 0;
		for (int i = 0; i < ordinati.size(); i++) {
			if (ordinati.get(i).haSessioneIncompleta()) {
				contaIncompleti++;
			}
		}

		System.out.println("\n------------------------------------------------------------");
		System.out.println("  Dipendenti con sessioni incomplete: " + contaIncompleti + " / " + ordinati.size());
	}
}