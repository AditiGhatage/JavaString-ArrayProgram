package com.StringExamples;

import java.util.Scanner;

public class StringEquality 
{
	public void checkStringEquality()
	{
		String strassign;
		@SuppressWarnings("resource")
		Scanner point = new Scanner(System.in);
		System.out.println("Enter First string : ");
		strassign = point.nextLine();
		String strbright;
		System.out.println("Enter Second String :");
		strbright = point.nextLine();
		
		if(strassign.equals(strbright))
		{
			System.out.println("Both strings are equal.");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		
	}
	

}
