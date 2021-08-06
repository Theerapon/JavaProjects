package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //forward 2 to 8
        for (int i = 2; i <= 8; i++) {
            printInterest(10000, i);
        }

        System.out.println();

        //backward 8 to 2
        for (int i = 8; i >= 2; i--) {
            printInterest(10000, i);
        }

        System.out.println();
        //print prime number and print count of the number of prime numbers found
        int range = 20;
        int countPrimeNumber = 0;
        for (int i = 1; i <= range; i++) {
            if(isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                countPrimeNumber++;
            }
        }
        System.out.println("Count of number of prime numbers found = " + countPrimeNumber);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        //example prime number = {2, 3, 5, 7, 11, 13, 17, 19, 23, ...}
        if (number == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (long) Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
    public static void printInterest(double amount, double interestRate) {
        System.out.printf("%.2f at %.2f%% interest = %.2f \n", amount, interestRate, calculateInterest(amount, interestRate));
    }
}
