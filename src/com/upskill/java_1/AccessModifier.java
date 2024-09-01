package com.upskill.java_1;

public class AccessModifier {

	String name = "Tarek";           				// public - Any class can access
	
	private int age = 25;            				// private - only same class can access
		
	protected int ssn = 1234567;     				// protected - classes in the same package and subclass
			
	    String address = "Heritage Tower;"   		// default - classes in same package can access
	
public void displayInfo() {
	
	System.out.println("name=" + name + ", age=" + age + ", ssn=" + ssn + ", address=" );
	
	    }
	    
public static void main(String[] args) {
	AccessModifier am = new AccessModifier();
	am.displayInfo();
}

}

