package oop170426;

import java.util.ArrayList;

public class Torneo {

	/*
	 * Torneo: nome, squadre (ArrayList<Squadra>), metodi: aggiungiSquadra(),
	 * classifica(), stampaTorneo()
	 */

	private String nome;
	private ArrayList<Squadra> squadre;

	public ArrayList<Squadra> getSquadre() {
		return squadre;
	}

	public Torneo(String n) {
		nome = n;
		squadre = new ArrayList<Squadra>();
	}

	public void aggiungiSquadra(Squadra s) {
		squadre.add(s);
	}

	public void stampaTorneo() {
		System.out.println("Torneo:" + nome);
		for (int i = 0; i < squadre.size(); i++) {
			squadre.get(i).stampa();
		}
	}

	public void classifica() {
		for (int i = 0; i < squadre.size(); i++) {
			for (int j = 0; j < squadre.size() - 1; j++) {
				if (squadre.get(j).punteggioSquadra() < squadre.get(j + 1).punteggioSquadra()) {
					Squadra tmp = squadre.get(j);
					squadre.set(j, squadre.get(j + 1));
					squadre.set(j + 1, tmp);
				}
			}
		}

		System.out.println("Classifica: ");
		for (int i = 0; i < squadre.size(); i++) {
			System.out.println((i + 1) + " posto: " + squadre.get(i).punteggioSquadra() + " punti");
		}
	}
}