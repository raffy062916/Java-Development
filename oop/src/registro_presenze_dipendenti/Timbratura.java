package registro_presenze_dipendenti;

/**
 * Rappresenta una singola timbratura (ingresso o uscita) con orario espresso in
 * ore e minuti interi.
 */
public class Timbratura {

	public enum Tipo {
		INGRESSO, USCITA
	}

	private final int ore;
	private final int minuti;
	private final Tipo tipo;

	public Timbratura(int ore, int minuti, Tipo tipo) {
		if (ore < 0 || ore > 23 || minuti < 0 || minuti > 59)
			throw new IllegalArgumentException("Orario non valido: " + ore + ":" + String.format("%02d", minuti));
		this.ore = ore;
		this.minuti = minuti;
		this.tipo = tipo;
	}

	/** Converte l'orario in minuti totali dalla mezzanotte. */
	public int aMinuti() {
		return ore * 60 + minuti;
	}

	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d (%s)", ore, minuti, tipo == Tipo.INGRESSO ? "ingresso" : "uscita");
	}
}
