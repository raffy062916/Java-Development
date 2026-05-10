package gestione_voti_scuola;

import java.util.ArrayList;
import java.util.List;

// Ogni studente è identificato da una matricola univoca (String) e ha un nome (String).

public class Studente {

	private String matricola;
	private String nome;
	private List<Double> voti;

	// costruttore vuoto
	public Studente() {
		super();
	}

	// costruttore con parametri
	public Studente(String matricola, String nome) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.voti = new ArrayList<Double>();
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Double> getVoti() {
		return voti;
	}

	public void setVoti(List<Double> voti) {
		this.voti = voti;
	}

	public void aggiungiVoto(double v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", voti=" + voti + "]";
	}
}