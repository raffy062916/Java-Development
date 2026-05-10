package studio_medico;

public class Paziente {
	private String nome;
	private int numeroTelefono;
	private String codiceFiscale;

	public Paziente(String nome, int numeroTelefono, String codiceFiscale) {
		this.nome = nome;
		this.numeroTelefono = numeroTelefono;
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return "Paziente [nome=" + nome + ", numeroTelefono=" + numeroTelefono + ", codiceFiscale=" + codiceFiscale
				+ "]";
	}

}