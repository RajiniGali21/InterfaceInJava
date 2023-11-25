package com.kn.Interface2;

public class CalculatorDemo {

	public static void main(String[] args) 
	{
//		Calculator1 c1 = new Calculator1();
		
		Calculator2 c2 = new Calculator2();
//		callMethods(c1);
		callMethods(c2);
	}
	public static void callMethods(Calculator c)
	{
		c.add();
		c.subtract();
		
	}
}
		 
		
		
		
		
			
	
	
