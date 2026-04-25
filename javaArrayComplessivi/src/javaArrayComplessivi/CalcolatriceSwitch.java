package javaArrayComplessivi;

import java.io.*;

public class CalcolatriceSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dichiara due variabili int (operando1, operando2) e una variabile char per l'operatore (+, -, *, /).
		 * Usando uno switch, esegui l'operazione corrispondente e stampa il risultato.
		 * Gestisci il caso di divisione per zero stampando un messaggio di errore.
		 * Gestisci anche il caso in cui l'operatore non sia valido con il blocco default
		 */
		
		//input da tastiera
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader inserimento = new BufferedReader(input);
		
		int operando1, operando2;
		char operatore;
		String dato, mex;
		
		//input
		System.out.print("Inserisci operando1: ");
		try
		{
			dato = inserimento.readLine();
			operando1 = Integer.valueOf(dato).intValue();
		}
		catch(Exception e)
		{
			System.out.println("\nIl dato inserito non è corretto");
			return;
		}
		
		System.out.print("\nInserisci operando2: ");
		try
		{
			dato = inserimento.readLine();
			operando2 = Integer.valueOf(dato).intValue();
		}
		catch(Exception e)
		{
			System.out.println("\nIl dato inserito non è corretto");
			return;
		}
		
		System.out.print("\nInserisci operatore: ");
		try
		{
			dato = inserimento.readLine();
			if(dato.length() != 1) 
			{
			    System.out.println("\nIl dato inserito non è corretto");
			    return;
			}
			operatore = dato.charAt(0);
		}
		catch(Exception e)
		{
			System.out.println("\nIl dato inserito non è corretto");
			return;
		}
		
		switch(operatore)
		{
			case '+':
				mex = String.format("%d %c %d = %d", operando1, operatore, operando2, operando1+operando2);
				System.out.println(mex);
			break;
			
			case  '-':
				mex = String.format("%d %c %d = %d", operando1, operatore, operando2, operando1-operando2);
				System.out.println(mex);
			break;
			
			case '*':
				mex = String.format("%d %c %d = %d", operando1, operatore, operando2, operando1*operando2);
				System.out.println(mex);
			break;
			
			case '/':
				if(operando2 == 0) 
				{
			        System.out.println("Errore: divisione per zero!");
			    } 
				else 
				{
					mex = String.format("%d %c %d = %.2f", operando1, operatore, operando2, (float)operando1/operando2);
					System.out.println(mex);
			    }
			break;
			
			default:
			    System.out.println("Errore: operatore non valido!");
			break;
		}
						
	}

}
