package studio_medico;

public class FasciaOraria {
	private String orario;
	private Paziente paziente;

	public FasciaOraria(String orario) {
		this.orario = orario;
		this.paziente = null;
	}

	public String getOrario() {
		return orario;
	}

	public void setOrario(String orario) {
		this.orario = orario;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	@Override
	public String toString() {
		return "FasciaOraria [orario=" + orario + ", paziente=" + paziente + "]";
	}

	public boolean isLibera() {
		return paziente == null;
	}

	public void prenota(Paziente p) {
		if (isLibera()) {
			this.paziente = p;
			System.out.println("Prenotazione alle " + orario + " per " + p.getNome() + " completata.");
			return;
		}
		System.out.println("Slot delle " + orario + " già occupato da " + paziente.getNome());
	}

	public void cancella(Paziente p) {
		if (paziente != null && paziente.equals(p)) {
			paziente = null;
			System.out.println("Cancellazione prenotazione alle " + orario + " per " + p.getNome() + " completata.");
			return;
		}
		System.out.println("Prenotazione alle " + orario + " per " + p.getNome() + " non trovata.");
	}
}
