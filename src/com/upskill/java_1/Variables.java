package com.upskill.java_1;

public class Variables {
	
	// Variables in Java
	  
	  // Instance OR global variable - Variables declared in Class level, outside method
	  // Static variable - variables belong to the class and dont required creating object
	  // Local Variable - variables declared in methods
	  // Method parameter - variables used as method parameter
	
	String country  = "USA";					// Instance OR global variable - Variables declared in Class level, outside method
	
	static String region = "America"; 			// Static variable - variables belong to the class and don't required creating object
	
	public static void main(String[] args) {
		String city = "New York";				// Local Variable - variables declared in methods
		michigan("Wayne");
		texas("Anderson");
	}
	
	
	public static void texas () {
		String city = "Dallas";				// Local Variable - variables declared in methods
	}
	
	public static void michigan(String[] args) {
			String city = "Detroit";				// Local Variable - variables declared in methods
			String mycounty = county;
	}

}
