package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

public class VokaleEntfernen 

	{

	public static String removeVowels(String s)
		{

	    for ( int i = 0; i < s.length(); i++ ) 
	    	{
		   
		    switch(s.charAt(i))
		    {
		    case 'A': 	 s = s.replace("A", "");
		    case 'E': 	 s = s.replace("E", "");
		    case 'I': 	 s = s.replace("I", "");
		    case 'O': 	 s = s.replace("O", "");
		    case 'U': 	 s = s.replace("U", "");
		    case 'a': 	 s = s.replace("a", "");
		    case 'e': 	 s = s.replace("e", "");
		    case 'i': 	 s = s.replace("i", "");
		    case 'o': 	 s = s.replace("o", "");
		    case 'u': 	 s = s.replace("u", "");
		    case '�': 	 s = s.replace("�", "");
		    case '�': 	 s = s.replace("�", "");
		    case '�': 	 s = s.replace("�", "");
		    case '�': 	 s = s.replace("�", "");
		    case '�': 	 s = s.replace("�", "");
		    case '�': 	 s = s.replace("�", "");
		    }    
	    	}
	    return s;
		}
	
	public static void main(String[] args) 	
		{
		
		System.out.println("Eingabe: ");
		
		@SuppressWarnings("resource")
		String s = new java.util.Scanner(System.in).nextLine();
		System.out.println(removeVowels(s));
		}

	}
