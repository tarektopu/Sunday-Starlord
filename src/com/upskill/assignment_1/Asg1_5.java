package com.upskill.assignment_1;

public class Asg1_5 {

    public static String getStudentOneName() {
        return "Alice";
    }

    public static int getStudentOneAge() {
        return 20;
    }

    public static String getStudentTwoName() {
        return "Bob";
    }

    public static int getStudentTwoAge() {
        return 21;
    }

    public static String getStudentThreeName() {
        return "Charlie";
    }

    public static int getStudentThreeAge() {
        return 22;
    }

    public static String getStudentFourName() {
        return "Diana";
    }

    public static int getStudentFourAge() {
        return 20;
    }

    public static String getStudentFiveName() {
        return "Eve";
    }

    public static int getStudentFiveAge() {
        return 23;
    }

    public static void displayStudentInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayStudentInfo(getStudentOneName(), getStudentOneAge());
        displayStudentInfo(getStudentTwoName(), getStudentTwoAge());
        displayStudentInfo(getStudentThreeName(), getStudentThreeAge());
        displayStudentInfo(getStudentFourName(), getStudentFourAge());
        displayStudentInfo(getStudentFiveName(), getStudentFiveAge());
    }
}

