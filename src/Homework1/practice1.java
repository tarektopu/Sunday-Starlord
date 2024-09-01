package Homework1;

public class practice1 {

	
public static void main(String[]args){
	newyork("Bronx");
	texas();
	
}

public static void texas(){
	String city = "Dallas";
	System.out.println(city);
}

public static void newyork(String county){      // Method parameter
	String myCounty = county;
	System.out.println(myCounty);
}

}