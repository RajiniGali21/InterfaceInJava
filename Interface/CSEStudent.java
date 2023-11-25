package com.kn.Interface;
 public  class CSEStudent implements Student
 {

	@Override
	public void study() 
	{
	System.out.println("studying on algorithms");	
	}

	@Override
	public void doProject()
	{
		System.out.println("doing project on e-commerence application");
	}
//abstract class  CSEStudent  implements Student
//{
//	public void study()
//	{
//		System.out.println("studying on algorithms");
//	}
//	public void doProject()
//	{
//		System.out.println("doing project on e-commerence application");
//	}
//	
//	

}
