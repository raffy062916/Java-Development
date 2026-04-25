package oop170426;

public class GiocatoreProfessionista extends Giocatore {

	/*
	 * GiocatoreProfessionista (estende Giocatore): sponsor, override totale() con
	 * bonus 10%
	 */

	private String sponsor;

	public GiocatoreProfessionista(String n, int e, String s) {
		super(n, e);
		sponsor = s;
	}

	@Override
	public double totale() {
		// 10% -> 1 + (10.0/100) -> 1.10
		return super.totale() * 1.10;
	}
}
