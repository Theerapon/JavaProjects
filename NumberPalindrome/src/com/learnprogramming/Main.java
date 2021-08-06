package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printPalindrome(1221);
        printPalindrome(-1221);
        printPalindrome(707);
        printPalindrome(11212);
    }

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int tempNumberAbs = number;
        int newNumber = 0;
        int multiply = 10;

        while (number > 0) {
            newNumber = ((newNumber * multiply) + (number % 10));
            number /= 10;
        }

        return tempNumberAbs == newNumber;
    }

    public static void printPalindrome(int number) {
        System.out.printf("%d is palindrome = %b\n", number, isPalindrome(number));
    }
}
