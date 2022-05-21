
//Static elements : 
//	1. All static elements will be loaded on RAM and they will be available in CPU to execution.
// 	2. It can be used in static area.

//Non-static elements : 
//	1. All non-static elements will be loaded on Hard-disk and they will be not available in CPU.
//	2. It is know as instance variable and methods also.
//	3. It is not usable directly in static area.

package com.assi3;

public class Static {
	
	int x = 20;
	static int y = 10;
	
	public void input () {
		System.out.println("print x : " + x);
	}
	
	public static void input2() {
		Static s2 = new Static();
		s2.x = 100;
		System.out.println("print x static :" + s2.x);
	}
	
	public static void main(String[] args) {
		
		Static s1 = new Static();
		
		System.out.println(s1.x); // Non static variable can be used with the help of object method.
		s1.input();
		
		
		System.out.println(Static.y); // Static variable can be used directly.
		
		Static.input2();
	}
}
