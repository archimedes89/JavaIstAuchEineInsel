package de.DominikCattaux.JavaIstAuchEineInsel.Uebungen.Kapitel5;

public class RadioStations 
	{
	final static String SWR4 = "swr4";
	final static double SWR4_FREQ = 91.4;
	final static String DASDING = "dasding";
	final static double DASDING_FREQ = 91.3;
	final static String SWR1 = "swr1";
	final static double SWR1_FREQ = 91.1;
	final static String BIGFM = "bigfm";
	final static double BIGFM_FREQ = 104.5;
	
	
	public double toFreq(String sender)
		{
		if(sender == null) return 0.0;
		switch(sender.trim().toLowerCase())
			{
		case SWR4 :		return SWR4_FREQ; 
		case DASDING:	return DASDING_FREQ; 
		case SWR1:		return SWR1_FREQ; 
		case BIGFM:		return BIGFM_FREQ; 
		default:		return 0.0;
			}
		}

	}
