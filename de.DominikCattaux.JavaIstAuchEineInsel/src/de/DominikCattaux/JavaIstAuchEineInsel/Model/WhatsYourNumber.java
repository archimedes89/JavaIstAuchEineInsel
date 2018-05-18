package de.DominikCattaux.JavaIstAuchEineInsel.Model;

public class WhatsYourNumber
	{
	
	public static void Numberguess()
		{
		int number = (int) (Math.random()*5+1);
		System.out.println("What number am i thinking about between 1 and 5? (3 trys)\n");
		for(int i = 2; i >= 0; i--)
			{
			@SuppressWarnings("resource")
			int guess = new java.util.Scanner(System.in).nextInt();
			
			if(!(Integer.valueOf(guess) instanceof Integer)) break;
			
			while(guess < 1 || guess > 5)
				{
				System.out.println("Just numbers between 1 and 5!\n\n");
				System.out.println("Your number, please...\n");
				guess = new java.util.Scanner(System.in).nextInt();
				}
			
			if(number == guess)
				{
				System.out.println("well guessed!");
				break;
				}
			else
				{
				System.out.println("unfortunately wrong. You've got " +i +" trys left");
				}
			if(i == 0)
				{
				System.out.println("\nThe right number was " +number);
				}
			}
		}
	
	public static void main(String[] args) 
		{
		Numberguess();
		}
	}
