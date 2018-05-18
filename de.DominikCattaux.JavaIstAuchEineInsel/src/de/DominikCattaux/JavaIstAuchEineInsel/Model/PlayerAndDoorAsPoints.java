package de.DominikCattaux.JavaIstAuchEineInsel.Model;

public class PlayerAndDoorAsPoints 
	{
	
	public static void main(String[] args) 
		{
		java.awt.Point player = new java.awt.Point();
		player.x = player.y = 0;
		
		java.awt.Point door = new java.awt.Point();
		door.setLocation(1, 1);
		
		System.out.println(player.distance(door));
		}
	}
