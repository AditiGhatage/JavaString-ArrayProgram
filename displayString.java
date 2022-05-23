package com.StringExamples;

import java.util.Scanner;

public class displayString 
{
	public void displayStringByChar()
	{
		String strchar;
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		strchar = scn.nextLine();
		char character;
		
		for(int intNum=0; intNum<strchar.length();intNum++)
		{
			character = strchar.charAt(intNum);
			System.out.println(character);
		}
		
	}

}
