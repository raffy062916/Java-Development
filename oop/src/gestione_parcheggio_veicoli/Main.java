package gestione_parcheggio_veicoli;

public class Main {

	public static void main(String[] args) {

		GestoreParcheggio gp = new GestoreParcheggio();

		// Aggiunta veicoli
		/*
		 * gp.aggiungiVeicolo(new Auto("AA123BB", "Fiat", 3, 1200)); // 7.50€
		 * gp.aggiungiVeicolo(new Auto("CC456DD", "BMW", 6, 2500)); // 15€ + 5€ = 20€
		 * gp.aggiungiVeicolo(new Moto("EF789GH", "Honda", 2, true)); // 3€ + 1€ = 4€
		 */

		gp.aggiungiVeicolo(new Auto("CV 323 BC", "BMW", 1, 2000));
		gp.aggiungiVeicolo(new Moto("BT 232 VC", "Augusta", 1, true));
		gp.aggiungiVeicolo(new Moto("BT 777 VC", "Piaggio", 6, true));
		gp.stampaVeicoli();
		double tot = gp.calcolaIncassoTotale();
		System.out.println("il totale degli incassi è: " + tot);
		gp.cercaPerTarga("CV 323 BC");
		gp.stampaSostaLunga();

	}

}
