package oop;

public class Moto extends Veicolo {
	private int cilindrata;
	
	
	public Moto(String marca, int cilindrata) {
		super(marca);
		this.cilindrata=cilindrata;
	}
	
	public int getCilindrata() {
		return this.cilindrata;
	}
}
