package gestione_parcheggio_veicoli;

public abstract class Veicolo {

	protected String marca;
	protected String targa;
	protected int ore_sosta;

	public Veicolo() {
	}

	public Veicolo(String marca, String targa, int ore_sosta) {
		this.marca = marca;
		this.targa = targa;
		this.ore_sosta = ore_sosta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getOre_sosta() {
		return ore_sosta;
	}

	public void setOre_sosta(int ore_sosta) {
		this.ore_sosta = ore_sosta;
	}

	public abstract double calcolaTariffa();

}
