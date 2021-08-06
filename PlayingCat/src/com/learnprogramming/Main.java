package com.learnprogramming;

public class Main {

    private static final int INST_MIN_TEMPERATURE = 25;
    private static final int INST_MAX_TEMPERATURE_ON_SUMMER = 45;
    private static final int INST_MAX_TEMPERATURE_ANOTHER_SEASONS = 35;

    public static void main(String[] args) {
        printCatPlaying(true, 10);
        printCatPlaying(false, 36);
        printCatPlaying(false, 35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean isCatPlaying = false;
        if (summer) {
            if(temperature >= INST_MIN_TEMPERATURE && temperature <= INST_MAX_TEMPERATURE_ON_SUMMER) {
                isCatPlaying = true;
            }
        } else {
            if(temperature >= INST_MIN_TEMPERATURE && temperature <= INST_MAX_TEMPERATURE_ANOTHER_SEASONS) {
                isCatPlaying = true;
            }
        }
        return isCatPlaying;
    }

    public static void printCatPlaying(boolean summer, int temperature) {
        System.out.printf("Is Summer = %b, Temperature = %d, Cat is playing = %b\n", summer, temperature, isCatPlaying(summer, temperature));
    }
}
