package javaArrayComplessivi;

import java.io.*;

public class ConvertitoreTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scrivi un programma che dichiari una variabile double contenente una temperatura in gradi Celsius.
		 * Il programma deve calcolare e stampare il valore equivalente in Fahrenheit e in Kelvin.
		 * Formula Fahrenheit: F = C × 9/5 + 32   |   Formula Kelvin: K = C + 273.15
		 * Stampa i risultati formattati a due cifre decimali.
		 */
		
		//input da tastiera
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader inserimento = new BufferedReader(input);
		
		double c, f, k;
		String dato, mex;
		
		//input
		System.out.print("Inserisci gradi celsius: ");
		try
		{
			dato = inserimento.readLine();
			System.out.println(dato);
			c = Double.valueOf(dato).doubleValue();
		}
		catch(Exception e)
		{
			System.out.println("\nIl dato inserito non è corretto");
			return;
		}
		
		//calcolo
		f = c*9/5+32;
		k = c+273.15;
		mex = String.format("I gradi sono:"
				+ "\n%.2f gradi Celsius"
				+ "\n%.2f gradi Fahrenheit"
				+ "\n%.2f gradi Kelvin", c, f, k);
		
		//stampa
		System.out.println(mex);
		
	}

}
