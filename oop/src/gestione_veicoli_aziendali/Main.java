package gestione_veicoli_aziendali;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Creazione della flotta (ArrayList di tipo Veicolo)
		ArrayList<Veicolo> flotta = new ArrayList<>();

		// Aggiungiamo istanze di Auto e Moto
		flotta.add(new Auto("Fiat", 180, 5));
		flotta.add(new Moto("Ducati", 290, false));
		flotta.add(new Auto("Tesla", 250, 4));

		System.out.println("--- Gestione Flotta Aziendale ---");

		for (Veicolo v : flotta) {
			v.descrivi();
		}

	}

}