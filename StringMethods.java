package com.StringExamples;

public class StringMethods 
{
	public void join() 
	{ //Join
		String date = String.join("/","25","06","2018");
		System.out.print(date);
		String time = String.join(":", "12","10","10");
		System.out.println(" "+time);
	}
	
	//AddingSpace
	public void addSpace() 
	{ 
		System.out.println("==============");
		String strJava = "CHOCOLATE";
		System.out.println("String before adding whitespaces: "+strJava);
		System.out.println("==============");
		String regex = "";
		// adding a white space before and after every character of the input string.
		strJava = strJava.replaceAll(regex, " ");

		System.out.println("String after adding whitespaces: "+strJava);
	}
	
	//replaceAll
	public void replaceAll() 
	{ 
		System.out.println("==============");
		String few="Chocolates are good for health.";
		String replaceString=few.replaceAll("a","e");//replaces all occurrences of "a" to "e"
		System.out.println(replaceString);
	}
	
	public void replace() //replace
	{
		System.out.println("==============");
		String strlong = "health is wealth.";
		String rs = strlong.replace("h","s"); // Replace 'h' with 's'
		System.out.println(rs);
		rs = rs.replace("s","h"); // Replace 's' with 'h'
		System.out.println(rs);
	}
	
	public void lastIndex()// Display index of a character
	{    
		System.out.println("==============");
		String strTemp="This is a roadmap";//there are 2 's' characters in this sentence  
		int intindex=strTemp.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println("Index of 's' is: "+intindex);//6  
	}
	
	public void startsWithExample() 
	{    
	// input string
		System.out.println("==============");
		String strLess="Faster while performs.";    
		System.out.println(strLess.startsWith("Fa"));  
		System.out.println(strLess.startsWith("faster"));     
		System.out.println(strLess.startsWith("Faster"));  
	}

}
