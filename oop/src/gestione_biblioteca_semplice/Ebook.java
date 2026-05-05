package gestione_biblioteca_semplice;

public class Ebook extends Libro {

	private String formato;

	// costruttore vuoto
	public Ebook() {
	}

	// costruttore con parametri
	public Ebook(String titolo, String autore, int pagine, double prezzo, String formato) {
		super(titolo, autore, pagine, prezzo);
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return super.toString() + " [Ebook - " + formato + "]";
	}
}
