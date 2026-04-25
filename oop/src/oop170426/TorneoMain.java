package oop170426;

public class TorneoMain {

	public static void main(String[] args) {

		/*
		 * Richieste: 1. Crea 2 squadre con giocatori normali e professionisti. 2.
		 * Aggiungi punteggi ai giocatori. 3. Calcola la classifica del torneo. 4.
		 * Stampa la squadra vincitrice.
		 */

		Torneo t = new Torneo("Coppa Java");

		// Crea 2 squadre
		Squadra s1 = new Squadra("I campioni");
		Squadra s2 = new Squadra("Gli sfigati");

		Giocatore g1 = new Giocatore("Mario", 20);
		Giocatore g2 = new Giocatore("Andrea", 21);
		GiocatoreProfessionista g3 = new GiocatoreProfessionista("Raffaele", 25, "C++");
		GiocatoreProfessionista g4 = new GiocatoreProfessionista("Dario", 22, "C#");
		GiocatoreProfessionista g5 = new GiocatoreProfessionista("Luigi", 24, "Python");
		Giocatore g6 = new Giocatore("Mario", 23);

		s1.aggiungiGiocatore(g1);
		s1.aggiungiGiocatore(g2);
		s1.aggiungiGiocatore(g3);

		s2.aggiungiGiocatore(g4);
		s2.aggiungiGiocatore(g5);
		s2.aggiungiGiocatore(g6);

		t.aggiungiSquadra(s1);
		t.aggiungiSquadra(s2);

		// 2. Aggiungi punteggi ai giocatori
		g1.aggiungiPunteggio(10);
		g1.aggiungiPunteggio(8);

		g2.aggiungiPunteggio(7);
		g2.aggiungiPunteggio(9);

		g3.aggiungiPunteggio(10);
		g3.aggiungiPunteggio(10);

		g4.aggiungiPunteggio(6);
		g4.aggiungiPunteggio(7);

		g5.aggiungiPunteggio(9);
		g5.aggiungiPunteggio(9);

		g6.aggiungiPunteggio(8);
		g6.aggiungiPunteggio(10);

		// 3. Calcola la classifica del torneo
		t.classifica();

		// 4. Stampa la squadra vincitrice (prima in classifica)
		System.out.println("\nSquadra vincitrice:");

		// Dopo classifica(), la prima squadra nella lista è la vincitrice
		Squadra vincitrice = t.getSquadre().get(0);
		vincitrice.stampa();
	}

}
