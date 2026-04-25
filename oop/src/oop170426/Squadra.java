package oop170426;

import java.util.ArrayList;

public class Squadra {

	/*
	 * Squadra: nome, giocatori (ArrayList<Giocatore>), metodi: aggiungiGiocatore(),
	 * punteggioSquadra(), stampa()
	 */

	private String nome;
	private ArrayList<Giocatore> giocatori;

	public Squadra(String n) {
		nome = n;
		giocatori = new ArrayList<Giocatore>();
	}

	public void aggiungiGiocatore(Giocatore g) {
		giocatori.add(g);
	}

	public double punteggioSquadra() {// somma punteggio dei giocatori della squadra
		double somma = 0;
		for (int i = 0; i < giocatori.size(); i++) {
			somma += giocatori.get(i).totale();
		}
		return somma;
	}

	public void stampa() {
		System.out.println("Squadra: " + nome + "\nPunteggio totale: " + punteggioSquadra() + "\nGiocatori: ");
		for (int i = 0; i < giocatori.size(); i++)
			giocatori.get(i).stampa();
	}
}
