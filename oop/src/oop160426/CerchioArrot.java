package oop160426;

/*
 * Scrivere il programma che calcola la circonferenza e l'area di due cerchi, con
 * arrotondamento alle prime tre cifre decimali per il calcolo dell'area del primo cerchio.
 * La classe usata per risolvere questo problema è simile a quella presentata nel Progetto 1,
 * ma viene adattata per rispondere alle esigenze specifiche di questo progetto. La richiesta
 * di calcolare la circonferenza del cerchio è risolta aggiungendo un nuovo metodo circonfe
 * renza, allo stesso modo l'arrotondamento dell'area è gestito dal metodo areaArrotondata
 */

public class CerchioArrot {

	private double raggio;

	// costruttore
	public CerchioArrot(double r) {
		raggio = r;
	}

	// get
	public double getRaggio() {
		return raggio;
	}

	// set
	public void setRaggio(double r) {
		raggio = r;
	}

	// metodo circonferenza
	public double circonferenza() {
		return 2 * Math.PI * raggio;
	}

	// metodo area
	public double area() {
		return (raggio * raggio);
	}

	// area arrotondata
	public double areaArrotondata() {
		double temp = area() * 1000;
		temp = Math.round(temp);
		temp = (double) temp / 1000;
		return temp;
	}

}
