package sistema_gestione_flotta;

/*
 * Esercizio: Il Sistema di Gestione Flotta
Immagina di dover gestire un parco veicoli. Ogni veicolo ha una marca, 
un modello e un prezzo di noleggio giornaliero.
Obiettivi:
Definisci un'interfaccia funzionale chiamata ValidatoreVeicolo che abbia un unico metodo 
test(Veicolo v) che restituisce un booleano.
 */

@FunctionalInterface
public interface ValidatoreVeicolo {

	boolean test(Veicolo v);
}
