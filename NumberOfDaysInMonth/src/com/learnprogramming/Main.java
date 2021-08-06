package com.learnprogramming;

public class Main {

    private static final int[] INST_DAYS_PER_MONTH_COMMON_YEAR = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] INST_DAYS_PER_MONTH_COMMON_LEAP_YEAR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        printDaysInMonth(1, 2020);
        printDaysInMonth(2, 2020);
        printDaysInMonth(2, 2018);
        printDaysInMonth(-1, 2020);
        printDaysInMonth(1, -2020);
        printDaysInMonth(-1, -2020);
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                  isLeapYear = true;
                }
            }
        }
        return isLeapYear;
    }
    public static int getDaysInMonth(int month, int year) {
        int day = -1;
        if((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            int mouthIndex = month - 1;

            if(isLeapYear(year)) {
                day = INST_DAYS_PER_MONTH_COMMON_LEAP_YEAR[mouthIndex];
            } else {
                day = INST_DAYS_PER_MONTH_COMMON_YEAR[mouthIndex];
            }
        }
        return day;
    }
    public static void printDaysInMonth(int month, int year) {
        System.out.printf("month %d, year %d = %d days\n", month, year, getDaysInMonth(month, year));
    }
}
