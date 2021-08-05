package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printLeapYear(1700);
        printLeapYear(1800);
        printLeapYear(1900);
        printLeapYear(2100);
        printLeapYear(2500);
        printLeapYear(2600);
        printLeapYear(1600);
        printLeapYear(2000);
        printLeapYear(2400);
        printLeapYear(1924);

    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year >= 1 && year <= 9999) {
           if (year % 4 == 0) {
               if (year % 100 == 0) {
                   if (year % 400 == 0) {
                       isLeapYear = true;
                   }
               } else {
                 isLeapYear = true;
               }
           }
        }
        return isLeapYear;
    }

    public static void printLeapYear(int year) {
        System.out.printf("year %d is leap years = %b\n", year, isLeapYear(year));
    }

}
