package com.learnprogramming;

public class Main {

    private static final String INST_INVALID_VALUE  = "Invalid Value";

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {
        String message = INST_INVALID_VALUE;
        if (number >= 1) {
            String factors = "";
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors += String.format("%d ", i);
                }
            }
            message = factors;
        }
        System.out.println(message);
    }
}
