package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel4;

import java.util.Arrays;

public class WortTrennen 
	{
	
	public static String trennen(String s)
		{
		String[] stringArray = s.split("\\W");
		int j = 0;													//j = Zählvariable, um die Größe des Arrays 																	
		int k = 0;													//result zu bestimmen.
		
		for(int i = 0; i < stringArray.length; i++)
			{		
			if(!(stringArray[i].isEmpty()))							//In dieser Schleife wird die Größe von result bestimmt.
				{
				j++;
				}
			}
		
		String[] result = new String[j];							// nötig, da stringArray auch null-Elemente speichert.
		
		for(String string : stringArray)
			{
			if(!(string.isEmpty()))
				{
				result[k] = string;
				k++;
				}
			}
		
		return Arrays.toString(result);
		}
	
	public static void main(String[] args) 
		{
		String input = javax.swing.JOptionPane.showInputDialog("Bitte Satz eingeben: ");
		System.out.println(trennen(input));
		}

	}
