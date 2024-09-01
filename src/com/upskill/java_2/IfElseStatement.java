package com.upskill.java_2;

public class IfElseStatement {
	
		public static void main(String[] args ) {
			
			int age = 104; 
			
			if (age <= 13){                                        // Condition 1
				System.out.println("You are Child");               //  
			} else if (age > 13 && age <18){                       //
				System.out.println("You are Teenager");            //
			} else if (age >= 60){                                 //
				if(age<100) {                                      // Nested if Else
					System.out.println("You are Senior");          //
				} else {                                           //
					System.out.println("You are Champion");        //
				}
			} else {
				System.out.println("You are Adult");               //
			}
		}

}
