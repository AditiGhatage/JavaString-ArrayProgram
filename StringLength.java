package com.StringExamples;

public class StringLength 
{
	//Check length of string
	public void lengthcheck()
	{
		String strlength = "Welcome to the virtual world";  
		String strlong = "Hypothesis";  
		System.out.println("string length is: "+strlength.length()); 
		System.out.println("string length is: "+strlong.length());
	}
	
	//print string in reverse order
	public void stringreverse()
	{

		String strName = "Java is a popular programming language";  
		int size = strName.length();  
  
		System.out.println("Reverse of the string: " + "'" + strName + "'" + " is");  
  
		for(int intLt = 0; intLt < size; intLt++)  
		{  
			System.out.print(strName.charAt(strName.length() - intLt - 1));  
		}  
	}
	
	public void substring()
	{
		String strName[] =  
			{  
			"Praveen Kumar",  
			"Yuvraj Singh",  
			"Harbhajan Singh",  
			"Gurjit Singh",  
			"Virat Kohli",  
			"Rohit Sharma",  
			"Sandeep Singh",  
			"Milkha Singh"  
			};  
			  
			String surName = "Singh";  
			int surNameSize = surName.length();  
			  
			int intsize = strName.length;  
			  
			for(int code = 0; code < intsize; code++)  
			{  
			    int length = strName[code].length();  
			    // extracting the surname  
			    String subString= strName[code].substring(length - surNameSize);  
			      
			    // checks whether the surname is equal to "Singh" or not  
			    if(subString.equals(surName))  
			    {  
			        System.out.println(strName[code]);  
			    }  
			}
	}

}
