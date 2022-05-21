package com.masai;

public class Dynamic {
	int y = 20;
	static int i = 4;
	void fun1() {
		System.out.println("inside fun 1");
	}
	
	public static void main(String[] args) {
		int x =10;
		System.out.println(x);
// by creating a object of a class we can load all the  non static members inside the 
		// static members
		Dynamic d1 = new Dynamic();
		d1.fun1();
	}
}
