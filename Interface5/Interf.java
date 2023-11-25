package com.kn.Interface5;

public interface Interf 
{
void m1();
void m2();
void m3();
void m4();
default void m5()
{
	System.out.println("default method in interface");
}
// private method is also in interface
private static void m6()
{
	System.out.println("private method can be called in interface");
}
//as main method can be called in interface
public static void main(String[] args)
{
Interf.m6();	
}
}
