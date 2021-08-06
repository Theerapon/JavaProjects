package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printLastDigitChecker(41, 22, 71);
        printLastDigitChecker(23, 32, 42);
        printLastDigitChecker(9, 99, 949);
        printLastDigitChecker(19, 99, 999);
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        boolean hasSameLastDigit = false;
        if ((isValid(firstNumber)) && (isValid(secondNumber)) && (isValid(thirdNumber))) {
            int firstLastDigit = firstNumber % 10;
            int secondLastDigit = secondNumber % 10;
            int thirdLastDigit = thirdNumber % 10;
            hasSameLastDigit = ((firstLastDigit == secondLastDigit)
                    || (firstLastDigit == thirdLastDigit)
                    || (secondLastDigit == thirdLastDigit)) ? true : false;
        }
        return hasSameLastDigit;
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static void printLastDigitChecker(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("%d, %d, %d are have the last digit at the same number = %b\n", firstNumber, secondNumber, thirdNumber,
                hasSameLastDigit(firstNumber, secondNumber, thirdNumber));
    }
}
