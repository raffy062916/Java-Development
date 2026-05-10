package registro_presenze_dipendenti;

import java.util.ArrayList;
import java.util.List;

public class Dipendente {
	private final String codice;
	private final String nome;
	private final String reparto;
	private final List<Timbratura> timbrature = new ArrayList<>();

	public Dipendente(String codice, String nome, String reparto) {
		this.codice = codice;
		this.nome = nome;
		this.reparto = reparto;
	}

	public boolean timbra(int ore, int minuti, Timbratura.Tipo tipo) {
		if (timbrature.isEmpty()) {
			if (tipo == Timbratura.Tipo.USCITA) {
				System.out.printf("  [ANOMALIA] %-20s → uscita senza ingresso.%n", nome);
				return false;
			}
		} else {
			// Prendiamo l'ultima timbratura usando l'indice size() - 1
			Timbratura ultima = timbrature.get(timbrature.size() - 1);
			if (ultima.getTipo() == tipo) {
				System.out.printf("  [ANOMALIA] %-20s → %s consecutivo non ammesso.%n", nome, tipo);
				return false;
			}
		}
		timbrature.add(new Timbratura(ore, minuti, tipo));
		return true;
	}

	public int minutiLavorati() {
		int totale = 0;
		// Ciclo classico a coppie (0-1, 2-3, ...)
		for (int i = 0; i + 1 < timbrature.size(); i += 2) {
			Timbratura entrata = timbrature.get(i);
			Timbratura uscita = timbrature.get(i + 1);
			totale += (uscita.aMinuti() - entrata.aMinuti());
		}
		return totale;
	}

	public boolean haSessioneIncompleta() {
		if (timbrature.isEmpty())
			return false;
		// Se l'ultima è un ingresso, manca l'uscita
		return timbrature.get(timbrature.size() - 1).getTipo() == Timbratura.Tipo.INGRESSO;
	}

	public String getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public String getReparto() {
		return reparto;
	}

	public String riepilogo() {
		int totMin = minutiLavorati();
		int ore = totMin / 60;
		int min = totMin % 60;
		String avviso = "";
		if (haSessioneIncompleta()) {
			avviso = "  ⚠ sessione incompleta";
		}
		return String.format("  [%s] %-20s | %-18s | Ore: %02d:%02d%s", codice, nome, reparto, ore, min, avviso);
	}
}