package registro_presenze_dipendenti;

/**
 * Programma principale — simula una giornata lavorativa con 4 dipendenti in 2
 * reparti, con situazioni miste.
 */
public class Main {

	public static void main(String[] args) {

		// ── Creazione dipendenti ────────────────────────────────────────
		Dipendente alice = new Dipendente("D001", "Alice Rossi", "Sviluppo");
		Dipendente bruno = new Dipendente("D002", "Bruno Verdi", "Sviluppo");
		Dipendente carla = new Dipendente("D003", "Carla Bianchi", "Amministrazione");
		Dipendente dario = new Dipendente("D004", "Dario Neri", "Amministrazione");

		// ── Simulazione timbrature ──────────────────────────────────────
		System.out.println("╔══════════════════════════════════════════════════════════════╗");
		System.out.println("║              SIMULAZIONE TIMBRATURE GIORNATA                 ║");
		System.out.println("╚══════════════════════════════════════════════════════════════╝");

		// Alice — giornata regolare con pausa pranzo
		System.out.println("\n  [Alice Rossi] — giornata regolare");
		alice.timbra(8, 30, Timbratura.Tipo.INGRESSO);
		alice.timbra(13, 0, Timbratura.Tipo.USCITA);
		alice.timbra(14, 0, Timbratura.Tipo.INGRESSO);
		alice.timbra(17, 30, Timbratura.Tipo.USCITA);

		// Bruno — doppio ingresso (anomalia), poi uscita regolare
		System.out.println("\n  [Bruno Verdi] — anomalia: doppio ingresso");
		bruno.timbra(9, 0, Timbratura.Tipo.INGRESSO);
		bruno.timbra(9, 15, Timbratura.Tipo.INGRESSO); // ← anomalia
		bruno.timbra(18, 0, Timbratura.Tipo.USCITA);

		// Carla — sessione incompleta (ingresso pomeridiano senza uscita)
		System.out.println("\n  [Carla Bianchi] — sessione incompleta");
		carla.timbra(8, 0, Timbratura.Tipo.INGRESSO);
		carla.timbra(12, 30, Timbratura.Tipo.USCITA);
		carla.timbra(13, 30, Timbratura.Tipo.INGRESSO);
		// nessuna uscita pomeridiana → sessione aperta

		// Dario — uscita senza ingresso (anomalia), poi coppia valida
		System.out.println("\n  [Dario Neri] — anomalia: uscita senza ingresso");
		dario.timbra(7, 45, Timbratura.Tipo.USCITA); // ← anomalia
		dario.timbra(7, 45, Timbratura.Tipo.INGRESSO);
		dario.timbra(16, 0, Timbratura.Tipo.USCITA);

		// ── Riepilogo giornaliero ───────────────────────────────────────
		RiepilogoGiornaliero riepilogo = new RiepilogoGiornaliero();
		riepilogo.aggiungiDipendente(alice);
		riepilogo.aggiungiDipendente(bruno);
		riepilogo.aggiungiDipendente(carla);
		riepilogo.aggiungiDipendente(dario);

		riepilogo.stampaRiepilogo();
	}
}
