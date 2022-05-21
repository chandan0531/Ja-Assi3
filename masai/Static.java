package com.masai;

public class Static {
		
	int y = 20;
	static int i = 100;
	void fun1() {
		System.out.println("inside fun 1");
	}
	
	static void fun2() {
		System.out.println("inside fun 2");
	}
	
	public static void main(String[] args) {
// by creating a object of a class we can load all the  non static members inside the 
// static members
		
//		Static d1 = new Static();
		
		Static.fun2();
	}
}
