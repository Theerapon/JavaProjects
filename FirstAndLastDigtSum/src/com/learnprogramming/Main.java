package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printSumFirstAndLastDigit(252);
        printSumFirstAndLastDigit(257);
        printSumFirstAndLastDigit(192);
        printSumFirstAndLastDigit(0);
        printSumFirstAndLastDigit(8);
        printSumFirstAndLastDigit(12);
        printSumFirstAndLastDigit(-12);
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = -1;
        if(number >= 0) {
            sum = 0;

            sum += number % 10;
            while (number / 10 > 0) {
                number /= 10;
            }
            sum += number;
        }
        return sum;
    }
    public static void printSumFirstAndLastDigit(int number) {
        System.out.printf("%d sum first and last digit = %d\n", number, sumFirstAndLastDigit(number));
    }
}
