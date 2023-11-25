package com.kn.Interface4;

public abstract class MyCalculator1 implements Calculator1,Calculator2
{

	@Override
	public void mutliplication()
	{
System.out.println("Mutliplication");		
	}

	@Override
	public void division() 
	{
System.out.println("Division");		
	}

}
