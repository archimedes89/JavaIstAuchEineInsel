package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

public class Quersumme 
	{

	public static int sumOfTheDigits(long value)
		{
		int quersumme = 0;
		String s = String.valueOf(value);									//Hilfsvariable, damit die for-Schleife die Länge
																			//des Argumentes(int value) kennt.
		for(int i = 0; i < s.length(); i++)
			{
			int ziffer =  Integer.parseInt(s.substring(i, i+1));			//Umwandlung der einzelnen Ziffern von String in int.
			quersumme +=  ziffer;
			}
		return quersumme;
		}
	
	public static void main(String[] args) 
		{
		System.out.println("Eingabe: ");
		
		@SuppressWarnings("resource")
		String s = new java.util.Scanner(System.in).nextLine();
		Long i = Long.parseLong(s);
		System.out.println(sumOfTheDigits(i));
		}

	}
