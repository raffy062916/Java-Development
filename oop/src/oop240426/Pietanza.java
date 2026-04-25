package oop240426;

public class Pietanza {
	private String nome;
	private Categoria categoria;
	private double prezzo;

	public enum Categoria {
		ANTIPASTO, PRIMO, SECONDO, DOLCE, BEVANDA
	}

	public Pietanza(String nome, Categoria categoria, double prezzo) {
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return nome + " - " + categoria + " - " + prezzo + "€";
	}
}