package ereditarieta;

public class Motorino {
	
	private String colore, tipo;
	private float velocita;
	private boolean antifurto = false;

	public Motorino(String c, String t, float v) {
		this.colore = c;
		this.tipo = t;
		this.velocita = v;
	}
	
	//set e get
	public String getColore() {
		return this.colore;
	}
	
	public String getTipo() {
		return this.tipo;
	}
		
	public float getVelocita() {
		return this.velocita;
	}
	
	public void setColore(String c) {
		this.colore = c;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public void setVelocita(float v) {
		this.velocita = v;
	}

	//metodo per accelerare, se l'antifurto è attivo non si può accellerare
	public void accelera(float v) {
		if (!this.antifurto)
			this.velocita += v;
	}

	//attivazione antifurto
	public void inserisciAntifurto() {
		this.antifurto = true;
	}
}