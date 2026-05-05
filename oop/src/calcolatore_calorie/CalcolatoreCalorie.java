package calcolatore_calorie;

import java.util.Scanner;

public class CalcolatoreCalorie {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int totaleCalorie = 0;

		System.out.println("Ciao, come ti chiami? ");
		String nome = input.nextLine();

		System.out.println("Quante calorie vuoi consumare oggi (limite)? ");
		int limiteCalorie = Integer.parseInt(input.nextLine());

		System.out.println("Quanti pasti hai fatto? ");
		int numeroPasti = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= numeroPasti; i++) {
			System.out.println("Calorie del " + i + " un pasto: ");
			int caloriePasto = Integer.parseInt(input.nextLine());
			totaleCalorie += caloriePasto;
		}

		if (totaleCalorie <= limiteCalorie) {
			System.out.println("Bravo " + nome + ", sei rimasto nel tuo obiettivo!");
		} else {
			System.out.println("Attenzione " + nome + ", hai superato il limite di " + limiteCalorie + " calorie.");
		}

		input.close();
	}

}
