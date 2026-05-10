package studio_medico;

import java.util.ArrayList;
import java.util.List;

public class Dottore {

	private int id;
	private String nome;
	private String specializzazione;
	private List<FasciaOraria> agenda;

	public Dottore(int id, String nome, String specializzazione) {
		this.id = id;
		this.nome = nome;
		this.specializzazione = specializzazione;
		this.agenda = new ArrayList<>();
		generaSlot();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public List<FasciaOraria> getAgenda() {
		return agenda;
	}

	@Override
	public String toString() {
		return "Dottore [id=" + id + ", nome=" + nome + ", specializzazione=" + specializzazione + "]";
	}

	private void generaSlot() {
		for (int h = 9; h < 13; h++) {
			agenda.add(new FasciaOraria(String.format("%02d:00", h)));
			agenda.add(new FasciaOraria(String.format("%02d:30", h)));
		}
		for (int h = 14; h < 18; h++) {
			agenda.add(new FasciaOraria(String.format("%02d:00", h)));
			agenda.add(new FasciaOraria(String.format("%02d:30", h)));
		}
	}

	public void mostraAgenda() {
	    System.out.println("\n--- Agenda Dott. " + nome + " ---");
	    for (FasciaOraria f : agenda) {
	        System.out.println(f.toString());
	    }
	}

	public int slotLiberi() {
		int num = 0;
		for (FasciaOraria fascia : agenda) {
			if (fascia.isLibera()) {
				num++;
			}
		}
		return num;
	}

	public int slotOccupati() {
		int num = 0;
		for (FasciaOraria fascia : agenda) {
			if (!fascia.isLibera()) {
				num++;
			}
		}
		return num;
	}

	public double occupazionePercentuale() {
		int totale = agenda.size();
		return (slotOccupati() * 100.0) / totale;
	}

}
