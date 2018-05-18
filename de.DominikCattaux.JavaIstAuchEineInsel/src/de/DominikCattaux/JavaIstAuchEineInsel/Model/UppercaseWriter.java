package de.DominikCattaux.JavaIstAuchEineInsel.Model;

public class UppercaseWriter
	{
	
	public static boolean isNumeric(String string)
		{
		if(string == null || string.length() == 0)
			return false;
		
		for(int i = 0; i < string.length(); i++)
			{
			char c = string.charAt(i);
			if(!Character.isDigit(c))
				{
				return false;
				}
			}
		return true;
		}
	
	public static void main(String[] args) 
		{
		System.out.println("Eingabe");
		@SuppressWarnings("resource")
		String input = new java.util.Scanner(System.in).nextLine();
		isNumeric(input);
		
		for(int i = 0; i < input.length(); i++)
			{
			char c = input.charAt(i);
			if(Character.isWhitespace(c))
				{
				System.out.print('_');
				}
			else if(Character.isLetter(c))
				{
				System.out.print(Character.toUpperCase(c));
				}
			}
		}
	}
