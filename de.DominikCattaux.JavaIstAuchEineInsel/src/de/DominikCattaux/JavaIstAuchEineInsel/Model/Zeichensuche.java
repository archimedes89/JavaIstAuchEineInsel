package de.DominikCattaux.JavaIstAuchEineInsel.Model;

public class Zeichensuche
	{

	public static void suche()
		{
		int count = 0;
		String trimmedinput;  
		
		System.out.println("Eingabe :");
		
		@SuppressWarnings("resource")
		String input = new java.util.Scanner(System.in).nextLine();
		StringBuilder x = new StringBuilder(input);
		
																			//Schleife eliminiert alle Zeichen, die keine 							
		for (int i = 0; i < x.length(); i++)								//Buchstaben oder Zahlen sind.
			{	
			for(int j = 0; j <100; j++)                                    //<----Zur verbesserten Suche
				{
				if(!(Character.isLetter(x.charAt(i)) 
					|| Character.isDigit(x.charAt(i))))
					{
					x.deleteCharAt(i);
					}
				}
			}
	
		trimmedinput = x.toString();

		Integer[] pos = new Integer[trimmedinput.length()];					// Array, um die Indizes der Zeichen innerhalb der
																			// Eingabe zu speichern.
		System.out.println("Nach welchem Zeichen soll gesucht werden: ");
		@SuppressWarnings("resource")
		String cast = new java.util.Scanner(System.in).nextLine();
		char sign = cast.charAt(0);											// eingelesenes String wird in char umgewandelt.
		
		for(int i = 0; i < trimmedinput.length(); i++)
			{
			if(trimmedinput.charAt(i) == sign)								// sucht nach dem eingegebenen Zeichen.
				{
				count++;
				pos[i] = i+1;												// speichert die Position des Zeichens in das Array pos.
				}
			}
		
		
		System.out.println(String.format("Das Zeichen '%s' taucht %s mal in der Eingabe '%s' auf \n"
				, sign, count, input));
		
		if(count > 0)
			{
			System.out.print("An den folgenden Stellen:");
		
			for(int i = 0; i < trimmedinput.length(); i++)
				{
				if(pos[i] != null)
					{
					System.out.print(" " + pos[i] +".");
					}
				}
			}
		}
	
	public static void main(String[] args) 
		{
		suche();
		}

	}
