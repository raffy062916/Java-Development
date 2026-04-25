package oop240426;

public class Timbratura {
	private int ora;
	private int minuto;
	private boolean isIngresso;

	public Timbratura(int o, int m, boolean isI) {
		this.ora = o;
		this.minuto = m;
		this.isIngresso = isI; // true = entrata, false = uscita
	}

	public void setOra(int o) {
		this.ora = o;
	}

	public int getOra() {
		return ora;
	}

	public void setMinuto(int m) {
		this.minuto = m;
	}

	public int getMinuto() {
		return minuto;
	}

	public boolean getIngresso() {
		return isIngresso;
	}

	public void setIngresso(boolean isI) {
		this.isIngresso = isI;
	}
}