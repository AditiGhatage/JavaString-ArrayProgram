package com.StringExamples;

public class StringConcat 
{
	public  void stringconcatination()
	{
		String strOne= "Welcome To ";
		String strTwo = "The Jurassic Park";
		String strThree = "Hello Summer.";
		
		String strFour = strOne.concat(strTwo)+" ".concat(strThree);
		System.out.println(strFour);
	}
	
	//search the sequence of characters in this string
	public void stringContains()
	{
		String strName = "The key character at the centre of the film is inspired by a real life individual.";
		System.out.println(strName.contains("at the centre"));
		System.out.println(strName.contains("inspired by"));
		System.out.println(strName.contains("Hello Summer."));
	}
	
	//
	public void endsWithString()
	{
		String strcome = "Welcome to Singapore.com";  
        System.out.println(strcome.endsWith("point"));  
        if(strcome.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        }else System.out.println("It does not end with .com");  
	}

}
