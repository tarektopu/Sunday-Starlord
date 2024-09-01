package com.upskill.assignment_1;

public class asg1_4 {

    public static int getNumberOne() {
        return 30;
    }

    public static int getNumberTwo() {
        return 50;
    }

    public static void main(String[] args) {
        int numberOne = getNumberOne();
        int numberTwo = getNumberTwo();

        int result;

        if (numberOne > numberTwo) {
            result = numberOne - numberTwo;
        } else {
            result = numberTwo - numberOne;
        }

        System.out.println("The result of the subtraction is: " + result);
    }
}
