package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

public class Knack
	{
	
	public static String knacken(String s)
		{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
			{
			int zufall = (int) (Math.random() *8+1);
			if(zufall == 8)
				{
				sb = sb.append("KNACK");
				}
			sb = sb.append(s.charAt(i));
			}
		return sb.toString();
		}
	
	public static String entknacken(String s)
		{
		return s.replace("KNACK", "");
		}
	
	public static void main(String[] args) 
		{
		System.out.println("Eingabe: ");
		
		@SuppressWarnings("resource")
		String s = new java.util.Scanner(System.in).nextLine();
		
		String se = knacken(s);
		System.out.println(se);
		
		System.out.println("\nStörsequenz entfernen? ('j' oder 'n')");
		@SuppressWarnings("resource")
		String c = new java.util.Scanner(System.in).nextLine();
		if(c.equals("j"))
		System.out.println(entknacken(se));
		}

	}
