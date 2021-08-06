package com.learnprogramming;

public class Main {

    private static final String[] INST_NUMBERS = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "OTHER"};

    public static void main(String[] args) {
        printNumberInWord(2);
        printNumberInWord(0);
        printNumberInWord(28);
    }

    public static void printNumberInWord(int number) {
        String message = "";
        switch (number) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                message = INST_NUMBERS[number];
                break;
            default:
                message = INST_NUMBERS[INST_NUMBERS.length - 1];
                break;
        }
        System.out.println(message);
    }
}
