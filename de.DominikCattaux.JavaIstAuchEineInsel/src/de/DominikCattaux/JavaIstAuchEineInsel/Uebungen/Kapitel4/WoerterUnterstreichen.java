package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

public class WoerterUnterstreichen
	{

	public static void printUnderline(String s, String underline)
		{
		int index = s.indexOf(underline);
		
		System.out.println(s);
		
		if(index >= 0)
			{
			for(int i = 0; i < s.length(); i++)
				{
				if(i >= index && i < index + underline.length())
					{
					System.out.print("_");
					}
				else
					{
					System.out.print(" ");
					}
				}
			}
		}
	
	public static void main(String[] args) 
		{
		System.out.println("Eingabe: ");
		@SuppressWarnings("resource")
		String s = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("Unterstrichenes Wort: ");
		@SuppressWarnings("resource")
		String u = new java.util.Scanner(System.in).nextLine();
		
		printUnderline(s,u);
		}

	}
