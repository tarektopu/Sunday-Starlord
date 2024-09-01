package Homework1;

import com.upskill.java_1.MethodType;

public class practice2 {	
	
	public static int hourlyIncome = 65;
	public static void main(String[]args) {
		weeklyIncomeStatic();
		
		MethodType MethodTypeObj = new MethodType();
		MethodTypeObj.monthlyIncomeReturn();
		System.out.println("My Monthly Income = "+ MethodTypeObj.monthlyIncomeReturn);
	}

	// Void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income =" + calculateAnnualIncome);
	}
	// return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	// static method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Annual Income =" + calculateWeeklyIncome);
	}	
}

