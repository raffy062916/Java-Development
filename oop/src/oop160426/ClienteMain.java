package oop160426;

public class ClienteMain {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Raffaele", "Fraterno", "123456789");
		Cliente c2 = new Cliente("Mario", "Rossi", "987654321");

		Fattura f1 = new Fattura(c1, "Penna", 1, 20.0);
		Fattura f2 = new Fattura(c2, "Computer", 2, 500.0);

		f1.stampaFattura();
		f2.stampaFattura();

		System.out.println(f1);
		System.out.println(f2);

		double pagamento = 1000;
		System.out.println("pagamento: " + pagamento);
		c1.pagamento(pagamento);

		System.out.println(f1);
		System.out.println(f2);

	}

}
