package gestione_veicoli_aziendali;

class Moto extends Veicolo {
	private boolean haSidecar;

	public Moto(String marca, int velocitaMassima, boolean haSidecar) {
		super(marca, velocitaMassima);
		this.haSidecar = haSidecar;
	}

	@Override
	public void descrivi() {
		String sidecarInfo = haSidecar ? "con sidecar" : "senza sidecar";
		System.out.println("Questa è una moto di marca " + getMarca() + " " + sidecarInfo + ".");
	}
}