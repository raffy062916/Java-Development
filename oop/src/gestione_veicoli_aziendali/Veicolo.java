package gestione_veicoli_aziendali;

public class Veicolo {

	// Attributi
	private String marca;
	private int velocitaMassima;

	// Costruttore
	public Veicolo(String marca, int velocitaMassima) {
		this.marca = marca;
		setVelocitaMassima(velocitaMassima); // Uso il setter per applicare il controllo
	}

	// Getter e Setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocitaMassima() {
		return velocitaMassima;
	}

	public void setVelocitaMassima(int velocitaMassima) {
		// la velocità non può essere negativa
		if (velocitaMassima >= 0) {
			this.velocitaMassima = velocitaMassima;
		} else {
			System.out.println("Errore: La velocità massima non può essere negativa. Impostata a 0.");
			this.velocitaMassima = 0;
		}
	}

	// Metodo per il Polimorfismo
	public void descrivi() {
		System.out.println("Questo è un veicolo di marca " + marca + ".");
	}
}