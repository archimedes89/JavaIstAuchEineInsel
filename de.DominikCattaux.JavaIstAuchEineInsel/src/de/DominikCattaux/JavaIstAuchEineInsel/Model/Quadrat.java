package de.DominikCattaux.JavaIstAuchEineInsel.Model;

public class Quadrat
	{
	
	public static int quadrat(int n)
		{
		return n*n;
		}
	
	public static void ausgabe(int n)
		{	
		int i;
		for(i=1; i <= n; i++)
			{
			System.out.format("Quadrat(%s) = %s\n", i, quadrat(i));
			}
		}
	
	public static void main(String[] args) 
		{
		ausgabe(100);
		}

	}
