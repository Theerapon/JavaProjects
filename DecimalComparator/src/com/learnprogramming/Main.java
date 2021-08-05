package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printEqualByThreeDecimalNumber(-3.175, -3.175);
        printEqualByThreeDecimalNumber(3.175, 3.175);
        printEqualByThreeDecimalNumber(3.0, 3.0);
        printEqualByThreeDecimalNumber(15.2, 15.32);
        printEqualByThreeDecimalNumber(3.1756, 3.1755);
        printEqualByThreeDecimalNumber(3.172, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstNumberInt = (int)(firstNumber * 1000);
        int secondNumberInt = (int)(secondNumber * 1000);
        return  firstNumberInt == secondNumberInt;
    }

    public static void printEqualByThreeDecimalNumber(double firstNumber, double secondNumber) {
        System.out.printf("%s is equal %s = %b\n", firstNumber, secondNumber, areEqualByThreeDecimalPlaces(firstNumber, secondNumber));
    }
}
