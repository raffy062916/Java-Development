package oop160426;

/*
 * Il progetto descrive la classe ContoCorrente che memorizza al suo interno il valore del
saldo, con un attributo privato, e lo movimenta tramite i metodi pubblici versa e preleva.
La classe dichiara altri due metodi pubblici per l'interrogazione del saldo, getSaldo, e per
la sua visualizzazione, stampaSaldo.
La classe ContoCorrente è schematizzata con il seguente diagramma di classe.
 */

public class ContoCorrente {

	private double saldo;

	// costruttore parametrizzato
	public ContoCorrente(double d) {
		this.saldo = d;
	}

	// get e set
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		saldo = d;
	}

	// metodo stampaSaldo
	public void stampaSaldo() {
		if (saldo <= 0)
			System.out.println("Fallimento,nessun saldo disponibile");
		else
			System.out.println("Saldo totale: " + saldo);
	}

	// metodo versa
	public void versa(double d) {
		if (d > 0)
			saldo += d;
		else
			System.out.println("La cifra inserita è negativa!!!");
	}

	// metodo preleva
	public void preleva(double d) {
		if (d > saldo) {
			System.out.println("Non puoi prelevare, saldo insufficiente!!!");
		} else {
			saldo -= d;
		}
	}
}
