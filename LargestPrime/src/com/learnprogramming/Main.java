package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(8));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        for (int i = 2; i <= (number / 2); i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

    /*public static int getLargestPrime(int number) {
        int largestPrime = -1;
        if(number <= 1) {
            return largestPrime;
        }

        for (int i = 2; i <= number; i++) {
            if(number % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }*/

}
