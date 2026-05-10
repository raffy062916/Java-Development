package sistema_gestione_flotta;

/*
 * Crea una classe Veicolo con i campi necessari (Marca, Modello, Prezzo).
 */

public class Veicolo {

	private String marca;
	private String modello;
	private double prezzo;

	// costruttore vuoto
	public Veicolo() {

	}

	// costruttore parametrizzato
	public Veicolo(String marca, String modello, double prezzo) {
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Veicolo [marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + "]";
	}

}
