package ereditarieta;

/*
 * Scrivere la classe **UsoMotorino** che ha il metodo **main** in cui si istanzia un oggetto 
 * di tipo **Motorino** di colore **grigiometallizzato** con velocità **40,5** e tipo **Piaggio Liberty**, 
 * richiamare il metodo **getVelocità** memorizzandone il valore in una variabile.
 * 
 * Istanziare un altro oggetto di tipo **MotorinoImmatricolato** con colore **rosso**, velocità **30,5**, 
 * tipo **Aprilia Scarabeo**, maxVelocità **60**, targa **CV1234**, e richiamare il metodo **getMax**.
 * 
 * Infine richiamare il metodo **accelera** con parametro pari a **30,7** per entrambi gli oggetti 
 * e quindi richiamare il metodo **getVelocità** per entrambi gli oggetti stampando i due valori.
 */

public class UsoMotorino {
	
	public static void main(String[] args) {
		
		//nuovo oggetto della classe padre
		Motorino m1 = new Motorino("grigiometallizzato", "Piaggio Liberty", 40.5f);
		float velocita_m1 = m1.getVelocita();
		
		//nuovo oggetto della classe specializzata/figlia 
		MotorinoImmatricolato m2 = new MotorinoImmatricolato("rosso", "Aprilia Scarabeo", 30.5f, 60f, "CV1234");
		float velocita_m2 = m2.getVelocita();
		m2.getMax();
		
		m1.accelera(30.7f);
		m2.accelera(30.7f);
		
		//nuove assegnazioni dopo il metodo accellera
		velocita_m1 = m1.getVelocita();
		velocita_m2 = m2.getVelocita();
		
		System.out.println("La velocità del primo motorino è: " + velocita_m1);
		System.out.println("La velocità del secondo motorino è: " + velocita_m2);
		
	}
}
