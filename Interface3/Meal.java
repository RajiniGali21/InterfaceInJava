package com.kn.Interface3;

public class Meal implements MainCourse,Desert
{

	@Override
	public void rasmalai() 
	{
		System.out.println("2 pieces");
	}

	@Override
	public void biriyani() 
	{
		System.out.println("Mushroom Biriyani");
	}
	

}
