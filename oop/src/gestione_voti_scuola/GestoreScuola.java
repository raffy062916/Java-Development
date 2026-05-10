package gestione_voti_scuola;

/*
 * Il Gestore Voti
Immagina di dover creare un sistema per una scuola. 
Crea un'interfaccia chiamata GestoreScuola che definisca i seguenti metodi:
void aggiungiStudente(String matricola, String nome)
String recuperaStudente(String matricola)
void stampaTutti()

Perché questo esercizio è utile?
Interfacce: Ti abitua a programmare "per contratti" (il Main usa il tipo GestoreScuola, non la classe specifica).
HashMap: Impari a gestire coppie chiave-valore e a recuperare dati istantaneamente senza cicli for complessi.

SFIDA: Vuoi provare a rendere l'esercizio più difficile aggiungendo una lista di voti (ArrayList) come valore 
della HashMap invece di una semplice stringa? 

—-------------------------------------------------------------------------------------------------------------
Una HashMap è una struttura dati che memorizza informazioni sotto forma di coppie chiave-valore. In termini 
semplici, funziona come un dizionario o una rubrica telefonica: usi una "chiave" univoca (come un nome) per 
trovare istantaneamente il "valore" associato (come un numero di telefono) 
Caratteristiche principali
Accesso Rapido: È estremamente efficiente per le operazioni di ricerca, inserimento e cancellazione, con un 
tempo di accesso medio costante.
Chiavi Univoche: Non possono esserci due chiavi identiche; se inserisci un nuovo valore con una chiave già 
esistente, il vecchio valore viene sovrascritti.
Nessun Ordine: A differenza degli array o delle liste, gli elementi in una HashMap non seguono un ordine 
specifico (non esiste un "primo" o "ultimo" elemento basato sulla posizione).
Meccanismo di Hashing: Internamente, usa una funzione di "hash" per trasformare la chiave in un indice di 
un array (chiamato bucket), permettendo al computer di sapere esattamente dove cercare il dato senza scorrere 
tutta la lista. [1, 2, 3, 4, 5, 6]
Esempio pratico (Java)
In Java, una delle implementazioni più note, si usa così: [1, 2]
java
HashMap<String, String> capitali = new HashMap<>();
capitali.put("Italia", "Roma"); // Inserimento
String citta = capitali.get("Italia"); // Recupero -> "Roma"
 * 
 */

public interface GestoreScuola {

	void aggiungiStudente(Studente s);

	Studente recuperaStudente(String m);

	void stampaTutti();
}
