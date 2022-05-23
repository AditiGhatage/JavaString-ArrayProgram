package com.ArrayExamples;

public class MultiDimensional 
{
	//Addition of twoD array
	public void additionOfArray()
	{
	int alpha[][]={{1,3,4},{2,4,3},{3,4,5}};    
	int beta[][]={{1,3,4},{2,4,3},{1,2,4}};       
	int theta[][]=new int[3][3];  //3 rows and 3 columns  
	System.out.println("======================== ");
	System.out.println("Addition of Array is: ");    
	//adding and printing addition of 2 matrices    
	for(int index=0;index<3;index++){    
	for(int sand=0;sand<3;sand++){    
	theta[index][sand]=alpha[index][sand]+beta[index][sand];  
	System.out.print(theta[index][sand]+" ");    
	}    
	System.out.println();//new line    
	} 
	}
	
	
	//Finding Array ELement Using Do-While Loop
	public void arrayDoWhileLoop() 
	{
	String strArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	int intCount=0;
	do {
	if(strArray[intCount].equals("Thursday")) {
	System.out.println("Thursday is present");
	break;
	}
	intCount++;
	}
	while(strArray.length>intCount);
	}

}
