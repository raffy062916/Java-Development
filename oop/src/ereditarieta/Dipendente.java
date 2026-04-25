package ereditarieta;

public class Dipendente {

	private String matricola;
	private double stipendio;
	private double straordinario; // importo aggiunto ogni ora di straordinario

	public Dipendente(String m, double s, double o) {
		setMatricola(m);
		setStipendio(s);
		setStraordinario(o);
	}

	// get e set
	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getStraordinario() {
		return straordinario;
	}

	public void setMatricola(String m) {
		/*
		 * if (m != null && !m.isEmpty()) { matricola = m; }
		 */
		matricola = m;
	}

	public void setStipendio(double s) {
		/*
		 * if (s < 0) { s = 0; }
		 */
		stipendio = s;
	}

	public void setStraordinario(double o) {
		/*
		 * if (o < 0) { o = 0; }
		 */
		straordinario = o;
	}

	public double paga(int n) { // n = numero ore di straordinario
		// return this.stipendio + this.straordinario * n;
		if (n < 0) {
			n = 0;
		}

		return getStipendio() + getStraordinario() * n;
	}

	public void stampa() {
		/*
		 * System.out.println("Matricola: " + this.matricola + " Stipendio: " +
		 * this.stipendio + " Straordinario: " + this.straordinario);
		 */
		System.out.println("Matricola: " + getMatricola() + " Stipendio: " + getStipendio() + " Straordinario: "
				+ getStraordinario());
	}
}
