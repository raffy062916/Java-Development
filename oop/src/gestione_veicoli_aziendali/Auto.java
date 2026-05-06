package gestione_veicoli_aziendali;

class Auto extends Veicolo {
	private int numeroPorte;

	public Auto(String marca, int velocitaMassima, int numeroPorte) {
		super(marca, velocitaMassima);
		this.numeroPorte = numeroPorte;
	}

	@Override
	public void descrivi() {
		System.out.println("Questa è un'auto di marca " + getMarca() + " con " + numeroPorte + " porte.");
	}
}