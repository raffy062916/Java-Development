package oop160426;

public class ProgCerchio {

	public static void main(String[] args) {

		CerchioArrot c1 = new CerchioArrot(5.5);

		System.out.println("Primo cerchio");
		System.out.println("Il raggio del cerchio è: " + c1.getRaggio());
		System.out.println("La circonferenza del cerchio è: " + c1.circonferenza());
		System.out.println("L'area del cerchio è: " + c1.area());
		System.out.println("L'area arrotondata del cerchio è: " + c1.areaArrotondata());

		c1.setRaggio(3.385);
		System.out.println("Secondo cerchio");
		System.out.println("Il raggio del cerchio è: " + c1.getRaggio());
		System.out.println("La circonferenza del cerchio è: " + c1.circonferenza());
		System.out.println("L'area del cerchio è: " + c1.area());
		System.out.println("L'area arrotondata del cerchio è: " + c1.areaArrotondata());

	}

}
