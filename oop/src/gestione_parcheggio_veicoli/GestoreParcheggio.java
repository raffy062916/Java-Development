package gestione_parcheggio_veicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreParcheggio {

	private List<Veicolo> veicoli;

	public GestoreParcheggio() {
		this.veicoli = new ArrayList<>();
	}

	public void aggiungiVeicolo(Veicolo veicolo) {
		this.veicoli.add(veicolo);
	}

	public void stampaVeicoli() {
		for (Veicolo ve : veicoli) {
			System.out.println("Targa: " + ve.getTarga() + "\nCosto totale: " + ve.calcolaTariffa());
		}
	}

	public double calcolaIncassoTotale() {
		double totale = 0;
		for (Veicolo v : veicoli) {
			totale += v.calcolaTariffa();
		}
		return totale;
	}

	public void stampaSostaLunga() {
		System.out.println("--- VEICOLI IN SOSTA DA PIÙ DI 5 ORE ---");
		for (Veicolo v : veicoli) {
			if (v.getOre_sosta() > 5) {
				System.out.println("Targa: " + v.getTarga() + " (" + v.getOre_sosta() + " ore)");
			}
		}
	}

	public Veicolo cercaPerTarga(String targa) {
		for (Veicolo v : veicoli) {
			if (v.getTarga().equalsIgnoreCase(targa)) {
				return v;
			}
		}
		return null; // Restituisce null se non trovato
	}
}
