package studio_medico;

public class Calendario {

	public static void main(String[] args) {

		Dottore d1 = new Dottore(1, "Mario", "Ortopedico");
		Dottore d2 = new Dottore(2, "Giuseppe", "Cardiologo");

		Paziente p1 = new Paziente("Pincopallino", 35698774, "GH185151");
		Paziente p2 = new Paziente("Pinco", 356657774, "WT155151");
		Paziente p3 = new Paziente("Peppino", 3878647, "K1238151");
		Paziente p4 = new Paziente("Peppiniello", 398563233, "LO23387451");

		prenotaFascia("09:00", d1, p1);
		prenotaFascia("16:00", d2, p2);
		prenotaFascia("17:30", d2, p3);
		prenotaFascia("17:30", d2, p4);

		cancellaFascia("16:00", d2, p3);

		riepilogoAgenda(d1);
		riepilogoAgenda(d2);
	}

	public static void prenotaFascia(String orario, Dottore d, Paziente p) {
		for (FasciaOraria f : d.getAgenda()) {
			if (f.getOrario().equals(orario)) {
				f.prenota(p);
				return;
			}
		}
	}

	public static void cancellaFascia(String orario, Dottore d, Paziente p) {
		for (FasciaOraria f : d.getAgenda()) {
			if (f.getOrario().equals(orario)) {
				f.cancella(p);
				return;
			}
		}
	}

	public static void riepilogoAgenda(Dottore d) {
		int s1 = d.slotOccupati();
		int s2 = d.slotLiberi();
		double percentuale = d.occupazionePercentuale();

		System.out.println("\n--- RIEPILOGO STUDIO ---");
		System.out.println("Dottore: " + d.getNome() + " (" + d.getSpecializzazione() + ")");
		System.out.println("Slot occupati: " + s1);
		System.out.println("Slot liberi: " + s2);
		System.out.println("Percentuale di occupazione: " + percentuale);
	}

}
