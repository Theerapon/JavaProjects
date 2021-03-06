package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long miles = -1L;
        if(kilometersPerHour >= 0) {
            miles = Math.round(kilometersPerHour / 1.609);
        }

        return  miles;
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.printf("%s km/h = %d mi/h\n", kilometersPerHour, milesPerHour);
        }

    }
}
