package com.kn.Interface;
public class MechStudent implements Student
{

	@Override
	public void study()
	{
		System.out.println("studying on autocad");
	}

	@Override
	public void doProject() 
	{
		System.out.println("doing project on robotics");
	}
	
}
