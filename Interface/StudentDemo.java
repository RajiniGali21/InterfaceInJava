package com.kn.Interface;

public class StudentDemo {

	public static void main(String[] args)
	{
		CSEStudent c1 = new CSEStudent();
		MechStudent m1 = new MechStudent();
		callMethods(c1);
		StudentDemo.callMethods(m1);
			
	}
	public static void callMethods(Student s)
	{
		s.study();
		s.doProject();
	}

}
