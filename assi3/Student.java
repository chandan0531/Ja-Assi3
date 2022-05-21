package com.assi3;

public class Student {
	
	int roll;
	String name;
	int mark;
	
	void displayStudentDetails () {
		
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + mark);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 10;
		s1.name = "Sheela";
		s1.mark = 79;
		
		s1.displayStudentDetails();

		System.out.println("===============");
		
		s2.roll = 30;
		s2.name = "Chameli";
		s2.mark = 67;
		
		s2.displayStudentDetails();
		
	}
}
