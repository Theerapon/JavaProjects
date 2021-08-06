package com.learnprogramming;

public class Main {

    private static final String INST_INVALID_VALUE = "Invalid Value";
    private static final int INST_MINUTES_PER_HOUR = 60;
    private static final  int INST_HOURS_PER_DAY = 24;
    private static final int INST_MINUTES_PER_DAY = INST_MINUTES_PER_HOUR * INST_HOURS_PER_DAY;
    private static final int INST_DAYS_PER_YEAR = 365;

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        String result = INST_INVALID_VALUE;
        if (minutes >= 0) {
            int tempDays = (int)(minutes / INST_MINUTES_PER_DAY);
            int tempYears = (tempDays / INST_DAYS_PER_YEAR);
            tempDays %= INST_DAYS_PER_YEAR;
            result = String.format("%s min = %s y and %s d\n", minutes, tempYears, tempDays);
        }
        System.out.println(result);
    }
}
