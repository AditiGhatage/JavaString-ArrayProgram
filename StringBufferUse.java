package com.StringExamples;

public class StringBufferUse 
{
	public void changeCase()
	{    
	        String strDemo="Great Power";    
	        StringBuffer newStrong=new StringBuffer(strDemo);    
	            
	        for(int index = 0; index < strDemo.length(); index++) {    
	                
	            //Checks for lower case character    
	            if(Character.isLowerCase(strDemo.charAt(index))) {    
	                //Convert it into upper case using toUpperCase() function    
	                 newStrong.setCharAt(index, Character.toUpperCase(strDemo.charAt(index)));    
	            }    
	            //Checks for upper case character    
	            else if(Character.isUpperCase(strDemo.charAt(index))) {    
	                //Convert it into upper case using toLowerCase() function    
	                 newStrong.setCharAt(index, Character.toLowerCase(strDemo.charAt(index)));    
	            }    
	        }    
	        System.out.println("String before case conversion : " + strDemo);    
	        System.out.println("String after case conversion : " + newStrong);    
	}
	
	public void replaceString()
	{
		StringBuffer strBuffer=new StringBuffer("Hello");  
		strBuffer.replace(1,3,"Java"); 
		System.out.println("===================");
		System.out.println("String after replace: "+strBuffer);
		strBuffer.delete(1,3);
		System.out.println("===================");
		System.out.println("String after deleting: "+strBuffer);
		
	}

}
