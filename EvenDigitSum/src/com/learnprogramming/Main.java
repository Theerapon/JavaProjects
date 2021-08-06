package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printEvenDigitSum(123456789);
        printEvenDigitSum(257);
        printEvenDigitSum(252);
        printEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {
        int sum = -1;
        if (number >= 0) {
            sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit % 2 == 0 ? digit : 0;
                number /= 10;
            }

        }
        return sum;
    }

    public static void printEvenDigitSum(int number) {
        System.out.printf("%d even digit sum = %d\n", number, getEvenDigitSum(number));
    }
}
