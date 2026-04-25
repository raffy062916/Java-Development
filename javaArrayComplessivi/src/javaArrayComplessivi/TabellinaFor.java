package javaArrayComplessivi;

public class TabellinaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dichiara una variabile int con un numero a scelta.
		 * Usando un ciclo for, stampa la tabellina di quel numero da 1 a 10.
		 * Il formato di output deve essere: 7 x 3 = 21
		 */
		
		int numero, i;
		
		numero = (int)(Math.random()*10);
		
		for(i=1; i<=10; i++) 
		{
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
	}

}
