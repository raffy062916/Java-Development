package gestione_voti_scuola;

public class Main {

	public static void main(String[] args) {

		Studente s1 = new Studente("A1", "Mario");
		Studente s2 = new Studente("A2", "Luigi");
		Studente s3 = new Studente("A3", "Andrea");
		Studente s4 = new Studente("A4", "Dario");

		GestoreScuola r = new RegistroScolastico();

		System.out.println();

		r.stampaTutti();

		System.out.println();

		r.aggiungiStudente(s1);
		r.aggiungiStudente(s2);
		r.aggiungiStudente(s3);
		r.aggiungiStudente(s4);

		System.out.println();

		r.stampaTutti();

		System.out.println();

		s1.aggiungiVoto(6.5);
		s1.aggiungiVoto(7.5);
		s2.aggiungiVoto(7.5);
		s2.aggiungiVoto(8.5);
		s3.aggiungiVoto(8.5);
		s3.aggiungiVoto(9.5);
		s4.aggiungiVoto(9.5);
		s4.aggiungiVoto(10.0);

		r.stampaTutti();
	}

}
