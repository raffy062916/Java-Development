package oop160426;

/*
 * La fattura è intestata ad un cliente
 * e contiene la descrizione del prodotto, la quantità e il prezzo unitario. Il totale della fattura
 * viene calcolato sommando l'imponibile (prezzo unitario * quantità) e l'imposta (imponibile
 * aliquota IVA).
 */

public class Fattura {

	private final int P_IVA = 22;

	private Cliente destinatario;

	public String descrizione;
	public int quantita;
	public double prezzoUnitario;

	public Fattura(Cliente c, String d, int q, double p) {
		destinatario = c;
		descrizione = d;
		quantita = q;
		prezzoUnitario = p;
	}

	public double imponibile() {
		return prezzoUnitario * quantita;
	}

	public double imposta() {
		return imponibile() * P_IVA / 100;
	}

	public double totaleFattura() {
		return imponibile() + imposta();
	}

	public void stampaFattura() {
		System.out.println("Totale fattura: " + totaleFattura());
		destinatario.addebito(totaleFattura());
		System.out.println();
		;
	}

	@Override
	public String toString() {
		return "Fattura{" + "destinatario='" + destinatario + "', descrizione='" + descrizione + '\'' + ", quantita="
				+ quantita + ", prezzoUnitario=" + prezzoUnitario + ", imponibile=" + imponibile() + ", imposta="
				+ imposta() + ", totale=" + totaleFattura() + '}';
	}
}
