package com.learnprogramming;

public class Main {

    private static final String[] INST_STRING_OF_NUMBERS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String INST_INVALID_VALUE  = "Invalid Value";
    private static final int INST_MULTIPLY = 10;

    public static void main(String[] args) {
        numberToWords(reverse(-123));
    }

    public static void numberToWords(int number) {
        String message = INST_INVALID_VALUE;
        if (number >= 0) {
            int digitCount = getDigitCount(number);
            String words = "";
            if (digitCount > 0) {
                for (int i = 0; i < digitCount; i++) {
                    int lastDigit = number % INST_MULTIPLY;
                    words = String.format("%s %s", INST_STRING_OF_NUMBERS[lastDigit], words);
                    number /= INST_MULTIPLY;
                }
            }
            message = words;
        }
        System.out.println(message);
    }

    public static int getDigitCount(int number) {
        int digitCount = -1;
        if (number >= 0) {
            digitCount = 0;
            do {
                digitCount++;
                number /= 10;
            } while (number > 0);
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int prefix = 1;

        if (number != 0) {
            prefix = number > 0 ? 1 : -1;
            number = Math.abs(number);
            while (number > 0) {
                reverseNumber = ((reverseNumber * INST_MULTIPLY) + (number % 10));
                number /= INST_MULTIPLY;
            }
        }

        return (reverseNumber * prefix);
    }
}
