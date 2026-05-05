package gestione_biblioteca_semplice;

public class Libro {

	// attributi
	private String titolo;
	private String autore;
	private int pagine;
	private double prezzo;

	// costruttore vuoto
	public Libro() {
	}

	// costruttore
	public Libro(String titolo, String autore, int pagine, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		setPagine(pagine);
		setPrezzo(prezzo);
	}

	// getter e setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		if (pagine >= 0) {
			this.pagine = pagine;
		} else {
			System.out.println("Valore pagine non valido. Impostato a 0.");
			this.pagine = 0;
		}
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo >= 0) {
			this.prezzo = prezzo;
		} else {
			System.out.println("Prezzo non valido. Impostato a 0.");
			this.prezzo = 0.0;
		}
	}

	// override del metodo toString
	@Override
	public String toString() {
		return String.format("Il libro '%s' di %s \nha %d pagine - Prezzo: %.2f€", titolo, autore, pagine, prezzo);
	}

}
