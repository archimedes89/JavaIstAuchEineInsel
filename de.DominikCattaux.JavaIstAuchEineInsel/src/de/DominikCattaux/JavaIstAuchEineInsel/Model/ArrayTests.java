package de.DominikCattaux.JavaIstAuchEineInsel.Model;

import java.util.Arrays;

public class ArrayTests 
	{
	
	public static int[] connectArrays (int[] a, int[] b)
		{
		int[] c = Arrays.copyOf(a, a.length + b.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		return c;
		}
 	
	public static void main(String[] args) 
		{
		int[] array1 = {4,2,6,3,2};
		int[] array2 = {5,9,4,3,1};
		int[] array3 = connectArrays(array1, array2);
		int j = 1;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2)+"\n");
		System.out.println(Arrays.toString(connectArrays(array1, array2))+"\n");
		
		for(int i : array3)
			{
			System.out.println(j+"te Zahl des Feldes = " +i);
			j++;
			}
		}

	}
