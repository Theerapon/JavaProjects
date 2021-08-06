package com.learnprogramming;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3657));
        System.out.println(getDurationString(54, 23));
        System.out.println(getDurationString(61, 0));
    }
    public static String getDurationString(int minutes, int seconds) {

        String str = "Invalid value";
        if(minutes >= 0 && seconds >= 0) {
            int tempMinutes = minutes + (seconds / 60);
            int tempSeconds = seconds % 60;
            int tempHour = tempMinutes / 60;
            tempMinutes %= 60;
            str = String.format("%02dh %02dm %02ds", tempHour, tempMinutes, tempSeconds);
        }
        return str;
    }

    public static String getDurationString(int seconds) {

        String str = "Invalid value";
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
