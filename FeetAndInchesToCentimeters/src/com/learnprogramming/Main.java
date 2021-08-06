package com.learnprogramming;

public class Main {

    private static final double INST_INCH_PER_CM = 2.54;
    private static final int INST_FOOT_PER_INCH = 12;

    public static void main(String[] args) {
        printFeetAndInchesToCentimeters(102, 21);
        printInchesToCentimeters(21);
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double centimeters = -1;
        if (feet >= 0 && inches >= 0) {
            int tempInches = (feet * INST_FOOT_PER_INCH) + inches;
            centimeters = tempInches * INST_INCH_PER_CM;
        }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        double centimeters = -1;
        if (inches >= 0) {
            centimeters = inches * INST_INCH_PER_CM;
        }
        return centimeters;
    }

    public static void printFeetAndInchesToCentimeters(int feet, int inches) {

        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters >= 0) {
            System.out.printf("%d feet, %d inch = %.4f cm\n", feet, inches, centimeters);
        } else {
            System.out.println("Invalid parameters");
        }

    }

    public static void printInchesToCentimeters(int inches) {
        double centimeters = calcFeetAndInchesToCentimeters(inches);
        if (centimeters >= 0) {
            System.out.printf("%d inch = %.4f cm\n", inches, centimeters);
        } else {
            System.out.println("Invalid parameters");
        }

    }

}
