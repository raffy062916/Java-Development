package processore_testi;

/*
Esercizio: Il Processore di Testi
Devi creare un sistema che applichi diverse strategie di formattazione a una lista di stringhe 
(ad esempio, titoli di libri o nomi di utenti).
Obiettivi:
Definisci un'interfaccia funzionale chiamata TrasformatoreTesto con un metodo String trasforma(String s).

Sfida Bonus 🏆
Prova a modificare il metodo elaboraStringhe in modo che utilizzi il metodo .replaceAll() 
con gli Stream di Java per fare tutto in una sola riga di codice.
*/

@FunctionalInterface
public interface TrasformatoreTesto {

	String trasforma(String s);
}
