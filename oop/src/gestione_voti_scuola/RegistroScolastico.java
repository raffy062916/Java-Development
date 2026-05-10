package gestione_voti_scuola;

import java.util.HashMap;

/*
 * Crea una classe chiamata RegistroScolastico che implementi l'interfaccia.
Usa una HashMap<String, String> all'interno della classe per salvare i dati (Chiave: matricola, Valore: nome).
Crea una classe Main per testare il funzionamento: aggiungi un paio di studenti, cercane uno tramite matricola 
e stampa l'elenco completo.
 */

public class RegistroScolastico implements GestoreScuola {

	private HashMap<String, Studente> registro = new HashMap<>();

	@Override
	public void aggiungiStudente(Studente s) {

		if (registro.containsKey(s.getMatricola())) {
			System.out.println("Studente gia presente!");
			return;
		}
		registro.put(s.getMatricola(), s);
		System.out.println("Studente " + s.getNome() + " aggiunto con successo!");
	}

	@Override
	public Studente recuperaStudente(String m) {

		if (registro.containsKey(m)) {
			return registro.get(m);
		}
		System.out.println("Studente non trovato!");
		return null;
	}

	@Override
	public void stampaTutti() {
		if (registro.isEmpty()) {
			System.out.println("Il registro e' vuoto!");
			return;
		}
		registro.values().forEach(System.out::println);
	}
}
