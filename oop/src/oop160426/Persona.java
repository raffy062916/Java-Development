package oop160426;

public class Persona {

	public static void main(String[] args) {

		Anagrafica p1 = new Anagrafica("Mario", "Rossi");
		p1.stampaDati();

		p1.registraEmail("mario.rossi@libero.it");
		p1.stampaDati();

	}

}
