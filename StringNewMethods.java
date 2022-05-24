package com.StringExamples;

public class StringNewMethods 
{
	public void stringTrim() 
	{     
	        String strhello =" Java Inheritance  ";    
	        System.out.println("Length of string: " +strhello.length());    
	        System.out.println("String without trim: "+strhello); //Without trim()    
	        String strtrim = strhello.trim();    
	        System.out.println("Length of string: "+strtrim.length());    
	        System.out.println("String without trim: "+strtrim); //With trim()    
	        
	}    
	
	public void stringValueOf()
	{    
	        // Float and Double to String  
		System.out.println("===============");
	        float flat  = 10.05f;    
	        double disk = 10.02;  
	        String strload = String.valueOf(flat);    
	        String strdeed = String.valueOf(disk);  
	        System.out.println(strload);  
	        System.out.println(strdeed);  
	}  
	
	public void isEmpty()
	{  
		System.out.println("===============");
	        String str="";    
	        String string="Happy";             
	        // Either length is zero or isEmpty is true  
	        if(str.length()==0 || str.isEmpty()) 
	            System.out.println("First string is empty");  
	        else System.out.println("s1");        
	        if(string.length()==0 || string.isEmpty())  
	            System.out.println("Second String is empty");  
	        else System.out.println("Second string is: "+string);  
	}  
	
	
}
