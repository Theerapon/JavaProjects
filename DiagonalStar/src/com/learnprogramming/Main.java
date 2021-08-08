package com.learnprogramming;

public class Main {

    private static final String INST_INVALID_VALUE  = "Invalid Value";
    private static final String INST_STAR  = "*";
    private static final String INST_SPACE = " ";
    private static final String INST_NEWLINE = "\n";

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        String message = "";

        if (number < 5) {
            message = INST_INVALID_VALUE;
        } else {
            int maxNumber = number - 1;
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == maxNumber || column == 0 || column == maxNumber || row == column
                            || (column + row) == maxNumber) {
                        message += INST_STAR;
                    } else {
                        message += INST_SPACE;
                    }
                }
                message += INST_NEWLINE;
            }
        }

        System.out.print(message);
    }
}
