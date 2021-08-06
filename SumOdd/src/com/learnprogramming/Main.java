package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printSumOdd(1, 100);
        printSumOdd(-1, 100);
        printSumOdd(100, 100);
        printSumOdd(13, 13);
        printSumOdd(100, -100);
        printSumOdd(100, 1000);
        printSumOdd(10, 5);
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;
        if (number >= 0) {
            isOdd = (number % 2 != 0) ? true : false;
        }
        return isOdd;
    }

    public static int sumOdd(int start, int end) {
        int sum = -1;
        if(end >= start && end > 0 && start > 0) {
            sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static void printSumOdd(int start, int end) {
        System.out.printf("(%d to %d), Sum = %d\n", start, end, sumOdd(start, end));
    }
}
