package ereditarieta;

/*
 * Esercizio — Sistema Bancario (Classi, Ereditarietà, Modificatori di Accesso)
 * Creare una classe ContoBancario con attributi titolare e saldo. La classe deve permettere di depositare, 
 * prelevare e visualizzare il saldo. Il prelievo non deve essere possibile se l'importo supera il saldo 
 * disponibile.
 */

public class ContoBancario {
	private String titolare;
	protected double saldo;

	public ContoBancario(String t, double s) {
		this.titolare = t;
		this.saldo = s;
	}

	// get e set
	public String getTitolare() {
		return this.titolare;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitolare(String t) {
		this.titolare = t;
	}

	protected void setSaldo(double s) {
		this.saldo = s;
	}

	public void deposito(double d) {
		if (d > 0)
			this.saldo += d;
		else
			System.out.println("Importo non valido!");
	}

	public void prelievo(double p) {
		if (p > 0 && p <= this.saldo)
			this.saldo -= p;
		else
			System.out.println("Importo non valido!");
	}

	public void visualizzaSaldo() {
		System.out.println("Saldo totale: " + this.saldo);
	}

}
