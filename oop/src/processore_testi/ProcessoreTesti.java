package processore_testi;

import java.util.ArrayList;
import java.util.List;

public class ProcessoreTesti {

	public static void main(String[] args) {

		/*
		 * Nel Main, crea una lista di nomi (es: "mario", "anna", "luca") e usa le
		 * espressioni lambda per ottenere: Tutti i nomi in MAIUSCOLO. Tutti i nomi con
		 * il prefisso "User: " (es: "User: mario"). Tutti i nomi invertiti (es: "anna"
		 * -> "anna", "luca" -> "acul").
		 */

		List<String> nomi = new ArrayList<>();
		List<String> maiuscolo = new ArrayList<>();
		List<String> prefissoUser = new ArrayList<>();
		List<String> invertiti = new ArrayList<>();

		nomi.add("mario");
		nomi.add("anna");
		nomi.add("luca");

		System.out.println("======PROCESSORE DI TESTI======");

		// Maiuscolo
		maiuscolo = elaboraStringhe(nomi, n -> n.toUpperCase());
		System.out.println("> Maiuscolo: " + maiuscolo);

		// Prefisso User
		prefissoUser = elaboraStringhe(nomi, n -> "User " + n);
		System.out.println("> Nomi con prefisso User: " + prefissoUser);

		// Invertiti
		invertiti = elaboraStringhe(nomi, n -> new StringBuilder(n).reverse().toString());
		System.out.println("> Nomi invertiti: " + invertiti);
	}

	/*
	 * Crea un metodo statico elaboraStringhe(List<String> lista, TrasformatoreTesto
	 * strategia) che restituisce una nuova lista contenente le stringhe modificate.
	 */
	public static List<String> elaboraStringhe(List<String> lista, TrasformatoreTesto strategia) {

		// List<String> nuovoTesto = new ArrayList<>();

		/*
		 * for (String elemento : nuovoTesto) {
		 * nuovoTesto.add(strategia.trasforma(elemento)); }
		 */

		// LAMBDA
		// lista.forEach(t -> nuovoTesto.add(strategia.trasforma(t)));

		// STREAM
		return lista.stream().map(strategia::trasforma).toList();
		// return lista.stream().map(elemento ->
		// strategia.trasforma(elemento)).toList();
	}

}
