package ereditarieta;

/*
 * Scrivere la sottoclasse DipendenteA della classe Dipendente che ha in più 
 * l'attributo malattia: un numero intero indicante i giorni di malattia presi 
 * che viene inizializzato a zero. 
 * 
 * Aggiungere il metodo prendiMalattia che ha come parametro un numero intero 
 * indicante i giorni di malattia presi, il metodo modifica il valore 
 * dell'attributo malattia aggiungendogli il valore del parametro. 
 * 
 * Ridefinire il metodo paga in modo che prima definisce una variabile p a cui 
 * assegna il valore ottenuto richiamando il metodo paga della superclasse, poi 
 * se l'attributo malattia è uguale a zero il metodo restituisce il valore di p 
 * altrimenti restituisce il valore ottenuto sottraendo a p il valore del 
 * prodotto tra malattia e 15,0. 
 * 
 * Definire un metodo stampaMalattia che stampa il valore dell'attributo malattia
 */

public class DipendenteA extends Dipendente {

	private int malattia = 0;// giorni di malattia presi

	public DipendenteA(String m, double s, double o, int n) {
		super(m, s, o);
		setMalattia(n); // malattia = n;
	}

	public int getMalattia() {
		return malattia;
	}

	public void setMalattia(int m) {
		/*
		 * if (m < 0) { m = 0; }
		 */
		malattia = m;
	}

	public void prendiMalattia(int n) {
		if (n > 0)
			setMalattia(getMalattia() + n);// malattia += n;
		else
			System.out.println("Errore nei giorni di malattia");
	}

}
