package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        int start = 1;
        int end = 1000;

        System.out.println("There Numbers can be divided with 3 and also with 5");
        for (int i = start; i <= end; i++) {

            if (isThreeOrFiveNumber(i)) {
                System.out.printf("Number is %d\n", i);
                sum += i;
                count++;
            }

        }
        System.out.println("Count all numbers = " + count + ", Sum = " + sum);
    }

    public static boolean isThreeOrFiveNumber(int number) {
        return (number % 3 == 0) && (number % 5 == 0);
    }
}
