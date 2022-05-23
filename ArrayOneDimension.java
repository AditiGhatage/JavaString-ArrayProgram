package com.ArrayExamples;

public class ArrayOneDimension 
{
	int array[] = new int[] {13,62,37,43,54,76,56,32,89,26};
	public void printArray()
	{
		System.out.println("Elements of given array are: ");
		for(int icon=0;icon<array.length;icon++)
		{
			System.out.println(array[icon]+"");
		}
	}
	
	//print elements on even position
	public void evenArrayElements()
	{
		System.out.println("Elements of given array present on even position are: ");  
		for (int integer = 1; integer < array.length; integer = integer+2) 
		{
		System.out.println(array[integer]); 
		}
	}
	
	//Finding Array Element Using For Each Loop
	public void arrayForEachLoop() 
	{
	String strArray[] = {"Red","Green","Blue","Grey","Black","White"};
	//int intCounter=0;

	for(String string : strArray) {
	if(string.equals("Blue")) {
	System.out.println("Blue is present");
	break;
	}
	}
	}
}
