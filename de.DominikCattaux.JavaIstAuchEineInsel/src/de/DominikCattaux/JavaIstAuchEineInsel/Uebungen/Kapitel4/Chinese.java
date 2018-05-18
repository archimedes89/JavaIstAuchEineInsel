package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

public class Chinese 
	{
	
	public static void speakLikeAChinese(String s)
		{
		s = s.replace('r', 'l');
		s = s.replace('R', 'L');
		
		System.out.println(s);
		}
	
	public static void main(String[] args) 
		{
		System.out.println("Eingabe: ");
		
		@SuppressWarnings("resource")
		String s = new java.util.Scanner(System.in).nextLine();
		speakLikeAChinese(s);
		}

	}
