package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel5;

public class Radio 
	{
	boolean isOn;
	int volume;
	double frequency;
	
	
	public void volumeUp()
		{
		if(isOn)
			{
			if(volume < 100)
				{
				volume += 1;
				}	
			else
				{
				volume = 100;
				System.out.println("MAX VOL.");
				}
			}
		}
	
	public void volumeDown()
		{
		if(isOn)
			{
			if(volume > 0)
				{
				volume -= 1;
				}
			else
				{
				volume = 0;
				System.out.println("MIN VOL.");
				}
			}
		}
	
	public void on()
		{
		isOn = true;
		System.out.println("On");
		}
	
	public void off()
		{
		isOn = false;
		System.out.println("Off");
		}
	
	public String toString()
		{
		if(isOn)
			{
			return String.format("%s an: Freq = %s, volume = %s", getClass().getSimpleName(), frequency, volume);
			}
		else
			{
			return String.format("%s aus", getClass().getSimpleName());
			}
		}
	
	public void setFrequency(double frequency)
		{
		if(isOn)
		this.frequency = frequency;
		}
	
	}
