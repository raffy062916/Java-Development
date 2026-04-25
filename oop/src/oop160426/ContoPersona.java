package oop160426;

public class ContoPersona {

	public static void main(String[] args) {

		ContoCorrente c1 = new ContoCorrente(500.00);

		c1.stampaSaldo();

		c1.versa(100);
		c1.stampaSaldo();

		c1.preleva(200);
		c1.stampaSaldo();

	}

}
