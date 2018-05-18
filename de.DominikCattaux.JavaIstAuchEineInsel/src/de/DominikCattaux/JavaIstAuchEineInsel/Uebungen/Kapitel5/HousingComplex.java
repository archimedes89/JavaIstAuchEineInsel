package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel5;

public class HousingComplex 
	{
	
	public static void main(String[] args)
		{
		RadioStations station = new RadioStations();
		Radio radio1 = new Radio();
		radio1.volume = 14;
		radio1.frequency = 104.5;
		radio1.isOn = false;
		
		radio1.volumeDown();
		radio1.on();
		radio1.volumeDown();
		radio1.volumeUp();
		radio1.volumeUp();
		radio1.off();
		System.out.println(radio1.toString());
		radio1.on();
		radio1.frequency = station.toFreq("Swr4");
		System.out.println(radio1.toString());
		}

	}
