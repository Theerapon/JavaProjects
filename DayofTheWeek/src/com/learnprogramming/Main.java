package com.learnprogramming;

public class Main {

    private static final String INST_SUNDAY = "Sunday";
    private static final String INST_MONDAY = "Monday";
    private static final String INST_TUESDAY = "Tuesday";
    private static final String INST_WEDNESDAY = "Wednesday";
    private static final String INST_THURSDAY = "Thursday";
    private static final String INST_FRIDAY = "Friday";
    private static final String INST_SATURDAY = "Saturday";
    private static final String INST_INVALID_DAY  = "Invalid day";

    public static void main(String[] args) {
        printDayOfTheWeekBySwitch(3);
        printDayOfTheWeekByIfThenElse(3);
    }

    public static void printDayOfTheWeekBySwitch(int day) {
        String message = "";
        switch (day) {
            case 0:
                message = INST_SUNDAY;
                break;
            case 1:
                message = INST_MONDAY;
                break;
            case 2:
                message = INST_TUESDAY;
                break;
            case 3:
                message = INST_WEDNESDAY;
                break;
            case 4:
                message = INST_THURSDAY;
                break;
            case 5:
                message = INST_FRIDAY;
                break;
            case 6:
                message = INST_SATURDAY;
                break;
            default:
                message = INST_INVALID_DAY;
                break;
        }
        System.out.println(message);
    }

    public static void printDayOfTheWeekByIfThenElse(int day) {
        String message = "";
        if(day == 0) {
            message = INST_SUNDAY;
        } else if(day == 1) {
            message = INST_MONDAY;
        } else if(day == 2) {
            message = INST_TUESDAY;
        } else if(day == 3) {
            message = INST_WEDNESDAY;
        } else if(day == 4) {
            message = INST_THURSDAY;
        } else if(day == 5) {
            message = INST_FRIDAY;
        } else if(day == 6) {
            message = INST_SATURDAY;
        } else {
            message = INST_INVALID_DAY;
        }
        System.out.println(message);
    }
}
