package oop170426;

import java.util.ArrayList;

public class Giocatore {

	/*
	 * Gestione di un torneo sportivo.
	 * 
	 * Giocatore: nome, eta, punteggi (ArrayList<Integer>), metodi:
	 * aggiungiPunteggio(), totale(), stampa()
	 */

	private String nome;
	private int eta;

	private ArrayList<Integer> punteggi;

	public Giocatore(String n, int e) {
		nome = n;
		eta = e;
		punteggi = new ArrayList<Integer>();
	}

	public void stampa() {
		System.out.println("Nome: " + nome + "\nEtà: " + eta + "\nPunteggi: ");
		for (int i = 0; i < punteggi.size(); i++)
			System.out.print(punteggi.get(i) + " ");
		System.out.println();
	}

	public double totale() {
		double tot = 0;
		for (int i = 0; i < punteggi.size(); i++)
			tot += punteggi.get(i);
		return tot;
	}

	public void aggiungiPunteggio(int p) {
		punteggi.add(p);
	}

}
