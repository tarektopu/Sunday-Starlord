package Homework1;

public class HW1 {
	
	// A triangle three arms are: 5, 7 and 11 inches. 
	// Write a method to display the perimeter of triangle in console output.
	public static void main(String[]args) {
		int a = 5;
		int b = 7;
		int c = 11;
		
		int Perimeter = a+b+c;
		
		System.out.println("Perimeter of the Triangle =" + Perimeter + "inches");
	
	
	//A rectangle width and length are: 9 and 13 inches. 
	// Write a method to display the perimeter of rectangle in console output.

	
		int width = 9;
		int length = 13;
		
		int RectanglePerimeter = 2*(width+length);
		
		System.out.println("Perimeter of Rectangle=" + RectanglePerimeter+ "inches");
		
	// A function which returns the multiply value of x and y where x = 9 and y = 11.      
	// Write a program which will display addition of x +y + function returns value.
			   
	        int x = 9;
	        int y = 11;
	        
	        // Calculate the product of a and b
	        int product = multiply(x, y);
	        
	        // Calculate the addition of x, y, and the product
	        int sum = x + y + product;
	        
	        // Display the results
	        System.out.println("Product of " + x + " and " + y + " = " + product);
	        System.out.println("Sum of " + x + ", " + y + ", and the product = " + sum);
	}
	 // A function which returns the multiply value of  x and y 
	
	public static int multiply(int x, int y)  {
		return x * y;
	
	
	}
}

package Homework1;

public class HW1 {
    
    // Function that returns 30
    public static int getThirty() {
        return 30;
    }

    // Function that returns 50
    public static int getFifty() {
        return 50;
    }

    // Main method
    public static void main(String[] args) {
        int value1 = getThirty();
        int value2 = getFifty();
        
        // Subtract the smaller number from the larger number
        int result = value2 - value1;
        
        // Display the result
        System.out.println("The result of subtracting " + value1 + " from " + value2 + " is: " + result);
    }
}
 

