package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printSharedDigitLimit(12, 23);
        printSharedDigitLimit(9, 99);
        printSharedDigitLimit(15, 5);
        printSharedDigitLimit(15, 59);

        printSharedDigit(15, 5);
        printSharedDigit(15, 522);
        printSharedDigit(13, 522);
    }

    public static boolean hasSharedDigitLimit(int firstNumber, int secondNumber) {
        boolean hasSharedDigit = false;
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {

            hasSharedDigit = hasSharedDigit(firstNumber, secondNumber);
        }
        return hasSharedDigit;
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        boolean hasSharedDigit = false;

        while (firstNumber > 0) {
            int firstDigit = firstNumber % 10;
            int tempSecondNumber = secondNumber;
            while (tempSecondNumber > 0) {
                int secondDigit = tempSecondNumber % 10;
                if (firstDigit == secondDigit) {
                    firstNumber = 0;
                    hasSharedDigit = true;
                    break;
                }
                tempSecondNumber /= 10;
            }
            firstNumber /= 10;
        }

        return hasSharedDigit;
    }

    public static void printSharedDigitLimit(int firstNumber, int secondNumber) {
        System.out.printf("Limit, %d and %d has shared digit = %b\n", firstNumber, secondNumber, hasSharedDigitLimit(firstNumber, secondNumber));
    }

    public static void printSharedDigit(int firstNumber, int secondNumber) {
        System.out.printf("%d and %d has shared digit = %b\n", firstNumber, secondNumber, hasSharedDigit(firstNumber, secondNumber));
    }
}
