package oop240426;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
	private int numeroTavolo;
	private int numeroCoperti;
	private double costoCoperto;
	private List<Pietanza> elencoPietanze;
	private boolean aperto;

	public Ordine(int numeroTavolo, int numeroCoperti, double costoCoperto) {
		this.numeroTavolo = numeroTavolo;
		this.numeroCoperti = numeroCoperti;
		this.costoCoperto = costoCoperto;
		this.elencoPietanze = new ArrayList<>();
		this.aperto = true;
	}

	public void aggiungiPietanza(Pietanza p) {
		if (!aperto) {
			System.out.println("Ordine chiuso");
			return;
		}

		elencoPietanze.add(p);
		System.out.println("Pietanza aggiunta: " + p);

	}

	public void rimuoviPietanza(String nome) {
		if (!aperto) {
			System.out.println("Ordine già chiuso");
			return;
		}

		Pietanza daRimuovere = null;

		for (Pietanza p : elencoPietanze) {
			// Usiamo equalsIgnoreCase per ignorare differenze tra maiuscole e minuscole.
			if (p.getNome().equalsIgnoreCase(nome)) {
				daRimuovere = p;
				break;
			}
		}

		if (daRimuovere != null)
			elencoPietanze.remove(daRimuovere);

	}

	public double calcolaTotale() {

		double subtotale = 0;
		for (Pietanza p : elencoPietanze) {
			subtotale += p.getPrezzo();
		}
		return subtotale + (numeroCoperti * costoCoperto);

	}

	public void chiudiEStampaScontrino() {
		this.aperto = false;

		System.out.println("\n--- SCONTRINO TAVOLO " + numeroTavolo + " ---");

		for (int i = 0; i < elencoPietanze.size(); i++) {
			System.out.println(elencoPietanze.get(i));
		}

		System.out.println("---------------------------------");
		System.out.println("Coperti: " + numeroCoperti + " x " + costoCoperto + "€");
		System.out.println("TOTALE DA PAGARE: " + calcolaTotale() + "€");
		System.out.println("---------------------------------\n");

	}

}