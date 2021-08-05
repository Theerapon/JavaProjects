package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printEqualSum(1, 1, 1);
        printEqualSum(1, 1, 2);
        printEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber) == thirdNumber;
    }

    public static void printEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("%d + %d equal %d is %b\n",
                firstNumber, secondNumber, thirdNumber,
                hasEqualSum(firstNumber, secondNumber, thirdNumber));
    }
}
