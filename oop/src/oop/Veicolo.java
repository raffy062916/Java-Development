package oop;

public class Veicolo {

	private String marca;
	
	//costruttore
	public Veicolo(String marca) {
		this.marca=marca;
	}
	
	//get
	public String getMarca()
	{
		return marca;
	}
	
	//set
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	
	public String mostraMarca()
	{
		return marca;
	}

}
