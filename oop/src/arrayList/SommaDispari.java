package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SommaDispari {

	public static void main(String[] args) {

		// Crea un ArrayList di Integer e calcola la somma dei numeri dispari.

		Scanner input = new Scanner(System.in);

		int somma = 0, dim;

		System.out.print("Quanti numeri vuoi inserire? ");
		dim = input.nextInt();

		ArrayList<Integer> numeri = new ArrayList<>(dim);// creazione ArrayList

		for (int i = 0; i < dim; i++) {
			System.out.print("Inserisci il " + (i + 1) + " numero: ");
			numeri.add(input.nextInt());

			if (numeri.get(i) % 2 != 0)
				somma += numeri.get(i);
		}

		System.out.println("Stampa ArrayList:");

		for (int i = 0; i < numeri.size(); i++) {
			if (numeri.get(i) == numeri.get(numeri.size() - 1))
				System.out.print(numeri.get(i));
			else
				System.out.print(numeri.get(i) + ", ");
		}

		System.out.print("\nStampa somma dei numeri dispari: ");
		System.out.print(somma);
	}
}