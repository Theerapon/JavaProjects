package com.learnprogramming;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Main {

    private static final String INST_INVALID_VALUE = "Invalid value";
    private static final int INST_SECOND_PER_MINUTE = 60;

    public static void main(String[] args) {
        System.out.println(getDurationString(3657));
        System.out.println(getDurationString(54, 23));
        System.out.println(getDurationString(61, 0));
    }
    public static String getDurationString(int minutes, int seconds) {
        return getDurationStringBySeconds((minutes * INST_SECOND_PER_MINUTE) + seconds);
    }

    public static String getDurationString(int seconds) {
        return getDurationStringBySeconds(seconds);
    }

    public static String getDurationStringBySeconds(int seconds) {
        String str = INST_INVALID_VALUE;
        if(seconds >= 0) {
            int tempMinutes = seconds / 60;
            int tempSeconds = seconds % 60;
            int tempHour = tempMinutes / 60;
            tempMinutes %= 60;
            str = String.format("%02dh %02dm %02ds", tempHour, tempMinutes, tempSeconds);
        }
        return str;
    }

}
