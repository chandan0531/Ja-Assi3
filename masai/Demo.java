//package com.masai;
//
//public class Demo {
////	int y = 20;  // instance variable
//	static int y = 20;  // instance variable
//	
//	public static void main(String[] args) {
//		int x =10;
//		System.out.println(y);
//	}
//}

package com.masai;

public class Demo {
	static int y = 20;  // instance variable
	
	static void fun1() {
		System.out.println("inside fun 1");
	}
	
	public static void main(String[] args) {
		int x =10;
		System.out.println(y);
		fun1();
	}
}
