package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		// Array store multiple data using index
		
		int age = 30;												// Variable
		int[] ageStarLord = new int[] {25, 30, 28, 32, 35, 27};			// Array
		
		//Array index                 [0]  [1] [2] [3] [4] [5]
		
		System.out.println("Student Age: " + ageStarLord[5]);
		System.out.println("Total Student: " + ageStarLord.length);
		
		String[] nameStarLord = new String[]{"Ahsan", "Arobi", "Elena", "Eshana", "Sani", "Tarek"};
		
		System.out.println("Student Name: " + nameStarLord[5]);
		System.out.println("Total Student Name: " + nameStarLord.length);
		
		//Multi-Dimentional Array
		int [][] ageStarLord2D = {{25, 30, 28, 32, 35, 27},   //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								  {26, 29, 30, 34}};		  //[1][0] [1][1] [1][2] [1][3]
		System.out.println("Student Age 2d : " + ageStarLord2D[0][4]);
		
		//Multi-Dimentional Array
				//String [][] nameStarLord2D = {{Ahsan, Arobi, Elena, Eshana, Sani, Tarek},   //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
										  //    {Nayeem, Mohaimen, Shafiq, Asif}};		        //[1][0] [1][1] [1][2] [1][3]
				//System.out.println("Student String 2d : " + nameStarLord2D[0][4]);//
				
		//Hashmap storemultiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ahsan", 26);
		Student.put("Arobi", 21);
		Student.put("Elena", 25);
		Student.put("Eshana", 24);
		Student.put("Sani", 19);
		Student.put("Tarek", 23);
		
		System.out.println("Hashmap student Age : " + Student.get("Arobi"));
		
		//Hashmap String String Country Capital
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("Spain", "Madrid");
		
		System.out.println("Capital City : " + Capital.get("Spain"));
		
		// HashTable store multiple data using key-value pair, no duplicate, does not allow null keys or null values also is synchronized (only one thread can be modified)
		
		//HashTable<String, String> Region = new HashTable<String, String>();
		
		//Region.put("BD", "Asia");
		//Region.put("Spain", "Europe");
				
		//System.out.println("Region : " + Region.get("BD"));
		
		// HashSet store unordered collection unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");	
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
	}

}
