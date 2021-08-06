package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printSumDigits(125);
        printSumDigits(-124);
        printSumDigits(4);
        printSumDigits(31231);
        printSumDigits(32123);
    }

    public static int sumDigits(int number) {
        int sum = -1;
        if (number >= 10) {
            sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        return sum;
    }
    public static void printSumDigits(int number) {
        System.out.printf("The sum of the digits in number %d is %d\n", number, sumDigits(number));
    }
}
