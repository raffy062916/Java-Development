package ereditarieta;

/*
 * Creare una classe ContoRisparmio che estende ContoBancario e aggiunge un tasso di interesse. 
 * Deve avere un metodo per applicare gli interessi al saldo.
 */

public class ContoRisparmio extends ContoBancario {

	private double tassoInteresse;

	public ContoRisparmio(String t, double s, double ti) {
		super(t, s);
		this.tassoInteresse = ti;
	}

	public void applicaTassoInteresse() {
		double interesse = saldo * tassoInteresse; // 0.03
		saldo += interesse;
		String s = "Il tasso di interesse è di: %.2f%%, il saldo è: %.2f".formatted((tassoInteresse * 100), saldo);
		System.out.println(s);
	}
}
