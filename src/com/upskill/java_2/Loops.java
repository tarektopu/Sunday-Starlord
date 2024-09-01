package com.upskill.java_2;

public class Loops {
	
/* Types of loops
 * 		1. For Loop - Do again and again upto upper limit 
 * 		2. While loop - Do again and again upto condition match
 * 		3. Do While Loop - Do action then Match condition
 * 		4. infinite loop - Never ending loop
 */

	public static void main(String[] args) {
		// practiceForLoop();
		// practiceWhileLoop();
		// practiceDoWhileLoop();
		// practiceInfiniteLoop();
		practiceNestedForLoop();
	}

	public static void practiceForLoop() {                      // For Loops - Do again and again upto upper limit
		int i;                                                  // Initializing the variable
		for (i= 10; i >= 1; i--) {                              // Setting lower limit, upper limit, increment or decrement
			System.out.println("For Loops number = " + i);      // Statement
		}
	}
	
	public static void practiceWhileLoop() {                  	// While Loop - Do again and again till condition match
		int i = 1;                                            	// Initialize the variable
		while(i<=10){                                         	// Setting condition 
			System.out.println("While Loops number =" + i);   	// statement
			i++;                                              	// Increment or decrement
		}
	
	}
	
	public static void practiceDoWhileLoop() {                   // Do while Loop - Do action then match condition
		int i = 1;                                               // Initializing the variable
		do {
			System.out.println("Do While Loops number = " + i);  // Statement
			i++;                                                 // Increment or Decrement 
		} while (i<=0);                                          // Checking condition
		
		}
	public static void practiceInfiniteLoop(){                   // Infinite Loop - Never ending loop
		int i;                                                   // Initialize the variable 
		for (i =1; ; i++){                                       // Setting No Upper limit
			System.out.println("Infinite loops Number" + i);     // Statement
		}
	}
	
	public static void practiceNestedForLoop(){                  // Nested Loop - loop inside another loop
		int i;                                                   // Initialize i for loop 1
		int j;                                                   // Initialize j for loop 2
		for (i=1; i<=10; i++){                                  // First loop for i
		   for (j=1; j<=10;j++){                                 // second loop for j
			  
			   int multiplicationTable = i * j;                  // staement for loop 2
			   System.out.print(multiplicationTable + " ");		 //	staement for loop 2   
		   }
		   System.out.println(" ");                              // Statement for loop 1
		}
	}
	}
