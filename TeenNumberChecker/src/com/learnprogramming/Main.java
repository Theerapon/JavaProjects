package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printHasTeen(9, 99, 19);
        printHasTeen(23, 15, 42);
        printHasTeen(22, 23, 24);
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        boolean hasTeen = false;
        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)) {
            hasTeen = true;
        }
        return hasTeen;
    }

    public static boolean isTeen(int number) {
        return (number >= 13 && number <= 19);
    }

    public static void printHasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("%d, %d, %d in range 13 - 19 is %b\n",
                firstNumber, secondNumber, thirdNumber, hasTeen(firstNumber, secondNumber, thirdNumber));
    }
}
