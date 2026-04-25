package oop160426;

/*
 * Dichiarare una classe per rappresentare le informazioni di una persona e per regi
 * strare il suo contatto email.
 * Il progetto realizza una classe per immagazzinare i dati anagrafici di una persona, in
 * particolare il nome, il cognome e il contatto email, oltre ad un valore booleano per indicare
 * se l'email è stata registrata. Gli attributi nome e cognome sono accessibili in modo
 * pubblico, mentre le informazioni sul contatto email sono private e modificabili solo tramite
 * il metodo registraEmail. È stato definito anche un metodo stampaDati per visualizzare i
 * dati della persona e il suo contatto solo nel caso sia stato registrato.
*/

public class Anagrafica {

	public String nome, cognome;
	private String mail;
	private boolean emailRegistrata;// false

	public Anagrafica(String n, String c) {
		this.nome = n;
		this.cognome = c;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String m) {// opzionale
		this.mail = m;
	}

	public void registraEmail(String m) {
		this.mail = m;
		this.emailRegistrata = true;
	}

	public void stampaDati() {
		System.out.println("Nome: " + nome + "\nCognome: " + cognome);
		if (emailRegistrata)
			System.out.println("Email: " + mail);
		else
			System.out.println("Email non registrata");
	}
}
