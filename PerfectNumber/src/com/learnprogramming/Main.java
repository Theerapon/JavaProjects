package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printPerfectNumber(6);
        printPerfectNumber(28);
        printPerfectNumber(5);
        printPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {
        boolean isPerfectNumber = false;
        if (number >= 1) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0 && i != number) {
                    sum += i;
                }
            }
            if (sum == number) {
                isPerfectNumber = true;
            }
        }
        return isPerfectNumber;
    }

    public static void printPerfectNumber(int number) {
        System.out.printf("%d is perfect number = %b\n", number, isPerfectNumber(number));
    }
}
