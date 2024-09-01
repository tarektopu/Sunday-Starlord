package com.upskill.java_4;

public class Encapsulation {
	
	// Encapsulation is used to Hide the data using setter and getter method

	private String name = "upskill";   			//write & read
	
	private int ssn = 123456789;       			//write only
	
	private String username = "raselalam";     // read only
	
	// Setter Method - name 					//Set the Data, Write
	public void setName(String value) {
		name = value;
	}
	
	// Getter Method - name 					// get the data, Read
	public String getName() {
		return name;
	}

	//Setter Method - ssn						//Set the Data, Write
	public void setSSN(int value){
		ssn = value;
	}
	
	// Getter Method - username 					// get the data, Read
		public String getUserName() {
			return username;
		}
		
		// DOB, Driving Licence, Address
		
		private String address = 82-11 37th Ave, NYC;           //write & read
		
		private int dob = 9871;							// write only
				
		private int dl = 12345678;							// read only
		
		public class Person {
		    // Private fields
		    private String address = "82-11 37th Ave, NYC";
		    private int dob = 9871;     						// Changed to a valid integer value
		    private int dl = 12345678;

		    // Getter for address                       		 //read only
		    public String getAddress() {
		        return address;
		    }

		    // Setter for address (write access)
		    public void setAddress(String address) {
		        this.address = address;
		    }

		    // Setter for dob (write access only)
		    public void setDob(int dob) {
		        this.dob = dob;
		    }

		    // Getter for dl (read access only)
		    public int getDl() {
		        return dl;
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        Person person = new Person();
		        
		        // Accessing and modifying the address
		        System.out.println("Address: " + person.getAddress());
		        person.setAddress("123 New Street, NYC");
		        System.out.println("Updated Address: " + person.getAddress());

		        // Setting the date of birth
		        person.setDob(12121980);
		        // No getter for dob, so we can't read it directly

		        // Accessing the driving license number
		        System.out.println("Driving Licence: " + person.getDl());
		        // No setter for dl, so we can't modify it
		    }
		}

}
