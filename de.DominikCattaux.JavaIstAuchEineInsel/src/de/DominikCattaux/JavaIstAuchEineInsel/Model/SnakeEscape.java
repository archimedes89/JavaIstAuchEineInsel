package de.DominikCattaux.JavaIstAuchEineInsel.Model;

import java.awt.Point;

public class SnakeEscape
	{
	public static void main(String[] args)
		{
		java.awt.Point playerPosition = new java.awt.Point(1,2);	//position of snake, player, gold and door
		java.awt.Point snakePosition = new java.awt.Point(38,2);
		java.awt.Point goldPosition = new java.awt.Point(13,10);
		java.awt.Point doorPosition = new java.awt.Point(39,6);
		
		boolean rich = false;
		while(true)
			{
			for(int y = 0; y <= 10; y++)
				{
				for(int x = 0; x <= 39; x++)
					{
					Point p = new Point(x,y);
				
					if(p.equals(playerPosition))
						{
						System.out.print('&');
						} 
					else if(p.equals(snakePosition))
						{
						System.out.print('~');
						}
					else if(p.equals(goldPosition))
						{
						System.out.print('$');
						}
					else if(p.equals(doorPosition))
						{
						System.out.print('#');
						}
					else System.out.print('.');
					}
				System.out.println();
				}
		
			if(playerPosition.equals(goldPosition))
				{
				rich = true;
				goldPosition.setLocation(-1,-1);
				}
			if(rich && playerPosition.equals(doorPosition))
				{
				System.out.println("Gewonnen!");
				break;
				}
			if(snakePosition.equals(playerPosition))
				{
				System.out.println("Die Schlange hat dich erwischt!");
				break;
				}
		
			switch(new java.util.Scanner(System.in).next().charAt(0))
				{
				case 'a' :	playerPosition.x = Math.max(0, playerPosition.x - 1); 
				if(playerPosition.equals(goldPosition))
					{
					goldPosition.setLocation(-1, -1);
					rich = true;
					}
				if(rich && playerPosition.equals(doorPosition))
					{
					System.out.println("Gewonnen!");
					break;
					}
				playerPosition.x = Math.max(0, playerPosition.x - 1);
				break;
				
				
				case 'd' : 	playerPosition.x = Math.min(39, playerPosition.x + 1);
				if(playerPosition.equals(goldPosition))
				{
				goldPosition.setLocation(-1, -1);
				rich = true;
				}
				if(rich && playerPosition.equals(doorPosition))
				{
				System.out.println("Gewonnen!");
				break;
				}
				playerPosition.x = Math.min(39, playerPosition.x + 1);
				break;
				
				
				case 's' :  playerPosition.y = Math.min(10, playerPosition.y + 1);
				if(playerPosition.equals(goldPosition))
				{
				goldPosition.setLocation(-1, -1);
				rich = true;
				}
				if(rich && playerPosition.equals(doorPosition))
				{
				System.out.println("Gewonnen!");
				break;
				}
				playerPosition.y = Math.min(10, playerPosition.y + 1);
				break;
				
				
				case 'w' :  playerPosition.y = Math.max(0, playerPosition.y - 1);
				if(playerPosition.equals(goldPosition))
				{
				goldPosition.setLocation(-1, -1);
				rich = true;
				}
				if(rich && playerPosition.equals(doorPosition))
				{
				System.out.println("Gewonnen!");
				break;
				}
				playerPosition.y = Math.max(0, playerPosition.y - 1);
				break;
				}
			
			 if ( playerPosition.x < snakePosition.x )
			        snakePosition.x--;
			      else if ( playerPosition.x > snakePosition.x )
			          snakePosition.x++;
			      if ( playerPosition.y < snakePosition.y )
			        snakePosition.y--;
			      else if ( playerPosition.y > snakePosition.y )
			        snakePosition.y++;
			      
			}
		}
	}
