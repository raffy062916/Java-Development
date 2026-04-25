package oop160426;

/*
 * Realizzare un programma per gestire la fatturazione, addebitando le fatture ai
 * clienti e accreditando i pagamenti ricevuti.
 * Il progetto richiede la descrizione di un sistema di fatturazione che limiteremo al caso di
 * emissione della fattura ad un cliente per un solo prodotto. Le entità rilevanti per questa
 * descrizione sono il Cliente e la Fattura. I clienti sono descritti con i loro dati anagrafici e il
 * saldo dei loro pagamenti. Il saldo aumenta se al cliente viene addebitata una fattura, al
 * contrario diminuisce se il cliente esegue un pagamento. 
*/

public class Cliente {

	private String nome;
	private String cognome;
	private String partitaIVA;
	private double saldo;

	public Cliente(String n, String c, String p) {
		nome = n;
		cognome = c;
		partitaIVA = p;
		saldo = 0;
	}

	/*
	 * public void setSaldo(double s) { this.saldo = s; }
	 * 
	 * public double getSaldo() { return this.saldo; }
	 */
	/*
	 * public String getPartitaIVA() { return partitaIVA; }
	 */

	/*
	 * public String getCognome() { return cognome; }
	 */

	public void addebito(double d) {
		saldo += d;
	}

	public void pagamento(double d) {
		saldo -= d;
	}

	@Override
	public String toString() {

		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", partitaIVA=" + partitaIVA + ", saldo=" + saldo
				+ "]";
	}

}