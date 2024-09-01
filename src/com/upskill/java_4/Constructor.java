package com.upskill.java_4;

public class Constructor {

	/* Constructor is instance of class, method same as class name, java will execute constructor first
	 - Constructor cannot be static or override nor void or return type.
	 - Default Constructor : No constructor is initialized
	 - Parameterized Constructor : Add different signature
	 - Constructor Overloading : Different signature
	 */
	
	String studentName;
	int studentAge;

	// Parameterized Constructor
	public Constructor(String name){
		studentName = name;
		
	}
	
	// Parameterized Constructor with age 
	public Constructor(int age){
		studentAge = age;
		
	}
	
	public Constructor(String name, int age){
		studentName = name;
		studentAge = age;
		
	}
	
		
	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Tarek");
		System.out.println(obj.studentName);
		
		Constructor obj2 = new Constructor(52);
		System.out.println(obj2.studentAge);
		
		Constructor obj3 = new Constructor ("Tarek", 52);
		
		System.out.println(obj3.studentAge);
		System.out.println(obj3.studentName);
		
	}

}
