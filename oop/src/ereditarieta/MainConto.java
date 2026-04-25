package ereditarieta;

/*
 * Creare una classe Main per testare il tutto: creare un conto risparmio, fare un deposito, un prelievo, 
 * applicare gli interessi, e tentare un prelievo superiore al saldo.
 * Usare correttamente i modificatori di accesso: decidere quali attributi devono essere private, 
 * quali metodi public, e cosa deve essere protected per permettere alla classe figlia di funzionare.
 */

public class MainConto {

	public static void main(String[] args) {

		ContoRisparmio cr = new ContoRisparmio("Marco", 10000, 0.03);

		System.out.println("Stato iniziale: ");
		cr.visualizzaSaldo();

		cr.prelievo(500);

		System.out.println("Stato dopo prelievo: ");
		cr.visualizzaSaldo();

		cr.deposito(1000);

		System.out.println("Stato dopo deposito: ");
		cr.visualizzaSaldo();

		cr.applicaTassoInteresse();
		System.out.println("Stato dopo applicazione interessi: ");
		cr.visualizzaSaldo();

		System.out.println("Prelievo errore");
		cr.prelievo(20000);

	}

}
