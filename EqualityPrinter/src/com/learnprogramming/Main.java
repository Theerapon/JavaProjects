package com.learnprogramming;

public class Main {

    private static final String INST_INVALID_VALUE = "Invalid Value";
    private static final String INST_ALL_NUMBER_EQUAL = "All numbers are equal";
    private static final String INST_ALL_NUMBER_DIFFERENT = "All numbers are different";
    private static final String INST_NEITHER_EQUAL = "Neither all are equal or different";

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        String result = INST_INVALID_VALUE;
        if(firstNumber >= 0 && secondNumber >= 0 && thirdNumber >= 0) {
            if(firstNumber == secondNumber && firstNumber == thirdNumber) {
                result = INST_ALL_NUMBER_EQUAL;
            } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
                result = INST_ALL_NUMBER_DIFFERENT;
            } else {
                result = INST_NEITHER_EQUAL;
            }
        }
        System.out.println(result);
    }
}
