package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

public class MorseCode 
	{
	
	public static void morsen(String s)
		{
		s = s.toUpperCase();

		for(int i = 0; i < s.length(); i++)
			{
			switch(s.charAt(i))
			{
			case 'A':	System.out.print(".- "); break;
			case 'B':	System.out.print("-... "); break;
			case 'C':	System.out.print("-.-. "); break;
			case 'D':	System.out.print("-.. "); break;
			case 'E':	System.out.print(". "); break;
			case 'F':	System.out.print("..-. "); break;
			case 'G':	System.out.print("--. "); break;
			case 'H':	System.out.print(".... "); break;
			case 'I':	System.out.print(".. "); break;
			case 'J':	System.out.print(".--- "); break;
			case 'K':	System.out.print("-.- "); break;
			case 'L':	System.out.print(".-.. "); break;
			case 'M':	System.out.print("-- "); break;
			case 'N':	System.out.print("-. "); break;
			case 'O':	System.out.print("--- "); break;
			case 'P':	System.out.print(".--. "); break;
			case 'Q':	System.out.print("--- "); break;
			case 'R':	System.out.print(".-. "); break;
			case 'S':	System.out.print("... "); break;
			case 'T':	System.out.print("- "); break;
			case 'U':	System.out.print("..- "); break;
			case 'V':	System.out.print("...- "); break;
			case 'W':	System.out.print(".-- "); break;
			case 'X':	System.out.print("-..- "); break;
			case 'Y':	System.out.print("-.--  "); break;
			case 'Z':	System.out.print("--.. "); break;
			case '0':	System.out.print("----- "); break;
			case '1':	System.out.print(".---- "); break;
			case '2':	System.out.print("..--- "); break;
			case '3':	System.out.print("...-- "); break;
			case '4':	System.out.print("....- "); break;
			case '5':	System.out.print("..... "); break;
			case '6':	System.out.print("-.... "); break;
			case '7':	System.out.print("--... "); break;
			case '8':	System.out.print("---.. "); break;
			case '9':	System.out.print("----. "); break;
			case ' ':	System.out.print(" "); break;
			default:	System.out.print(""); break;
			}
			}
		}
	
	public static void main(String[] args) 
		{
		System.out.println("Eingabe: ");
		
		@SuppressWarnings("resource")
		String s = new java.util.Scanner(System.in).nextLine();
		morsen(s);
		}

	}
