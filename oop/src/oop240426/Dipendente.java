package oop240426;

import java.util.ArrayList;
import java.util.List;

public class Dipendente {

	private int codiceIdentificativo;
	private String nome;
	private String reparto;
	private int erroriTimbratura = 0; // contatore per gestire il tipo di anomalia

	private List<Timbratura> registroGiornaliero;

	public Dipendente(int ci, String n, String r) {
		this.codiceIdentificativo = ci;
		this.nome = n;
		this.reparto = r;
		this.registroGiornaliero = new ArrayList<>();
		;
	}

	public void timbra(int o, int m, boolean isI) {

		// 1. CONTROLLO DI COERENZA (solo se c'è già almeno una timbratura)
		if (!registroGiornaliero.isEmpty()) {
			Timbratura ultimaTimbratura = registroGiornaliero.get(registroGiornaliero.size() - 1);

			if (ultimaTimbratura.getIngresso() == isI) {
				this.erroriTimbratura++;
				System.out.println("Errore: operazione non consentita per " + this.nome);
				return; // Esci dal metodo senza aggiungere nulla
			}
		}

		// 2. AGGIUNTA (avviene se la lista è vuota OPPURE se il controllo sopra è
		// passato)
		registroGiornaliero.add(new Timbratura(o, m, isI));
	}

	public double calcoloOreTotali() {
		double oreTotali = 0;
		int minutiLavorati = 0;

		for (int i = 0; i < registroGiornaliero.size() - 1; i += 2) {
			Timbratura ingresso = registroGiornaliero.get(i);
			Timbratura uscita = registroGiornaliero.get(i + 1);

			int minutiIngresso = ingresso.getOra() * 60 + ingresso.getMinuto();
			int minutiUscita = uscita.getOra() * 60 + uscita.getMinuto();

			minutiLavorati += (minutiUscita - minutiIngresso);
		}

		oreTotali = minutiLavorati / 60.0;

		return oreTotali;
	}

	public boolean haAnomalie() {
		// Se il numero di timbrature è dispari, manca un'uscita!
		return registroGiornaliero.size() % 2 != 0;
	}

	public String getDescrizioneAnomalia() {
		String descrizione = ""; // 1. Partiamo con un rapporto vuoto

		// 2. CONTROLLO "USCITA DIMENTICATA"
		if (registroGiornaliero.size() % 2 != 0) {
			descrizione += "[Manca Uscita Finale] ";
		}

		// 3. CONTROLLO "ERRORI DI TIMBRATURA"
		if (erroriTimbratura > 0) {
			descrizione += "[Tentata doppia timbratura: " + erroriTimbratura + " volte]";
		}

		// 4. CONCLUSIONE
		if (descrizione.isEmpty()) {
			return "Nessuna"; // Se il rapporto è ancora vuoto, tutto è OK
		} else {
			return descrizione; // Altrimenti restituisci l'elenco dei problemi trovati
		}
	}

	public void setCodiceIdentificativo(int ci) {
		this.codiceIdentificativo = ci;
	}

	public int getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setReparto(String r) {
		this.reparto = r;
	}

	public String getReparto() {
		return reparto;
	}

	public String toString() {
		return "Dipendente [codiceIdentificativo=" + codiceIdentificativo + ", nome=" + nome + ", reparto=" + reparto
				+ "]";
	}
}