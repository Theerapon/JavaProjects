package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printGreatestCommonDivisor(-12, 30);
        printGreatestCommonDivisorByEuclidean(-12, 30);

        printGreatestCommonDivisor(25, 15);
        printGreatestCommonDivisorByEuclidean(25, 15);

        printGreatestCommonDivisor(9, -5);
        printGreatestCommonDivisorByEuclidean(9, -5);

        printGreatestCommonDivisor(720, 1512);
        printGreatestCommonDivisorByEuclidean(720, 1512);

        printGreatestCommonDivisor(-20, 15);
        printGreatestCommonDivisorByEuclidean(-20, 15);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = -1;
        first = Math.abs(first);
        second = Math.abs(second);
        for (int i = 1; (i <= first && i <= second); i++) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }

    public static int getGreatestCommonDivisorByEuclidean(int first, int second) {
        int divisor = -1;
        first = Math.abs(first);
        second = Math.abs(second);
        int i = 0;
        while (first != 0 && second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
            divisor = first;
        }
        return divisor;
    }

    public static void printGreatestCommonDivisor(int first, int second) {
        System.out.printf("%d and %d greatest common divisor = %d\n", first, second, getGreatestCommonDivisor(first, second));
    }

    public static void printGreatestCommonDivisorByEuclidean(int first, int second) {
        System.out.printf("%d and %d GCD By Euclidean = %d\n", first, second, getGreatestCommonDivisorByEuclidean(first, second));
    }
}
