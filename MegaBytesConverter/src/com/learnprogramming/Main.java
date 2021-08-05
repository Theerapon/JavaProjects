package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(1023);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes >= 0) {
            int megaBytes = calculateMegaBytes(kiloBytes);
            int remainingKiloBytes = calculateRemainingKiloBytes(kiloBytes);
            System.out.printf("%d KB = %s MB and %s KB\n", kiloBytes, megaBytes, remainingKiloBytes);
        } else {
            System.out.println("Invalid Value");;
        }
    }

    public static int calculateMegaBytes(int kiloBytes) {
        int megaBytes = -1;

        if(kiloBytes >= 0) {
            megaBytes = kiloBytes / 1024;
        }
        return megaBytes;
    }

    public static int calculateRemainingKiloBytes(int kiloBytes) {

        int remainingKiloBytes = -1;

        if(kiloBytes >= 0) {
            int megaBytes = calculateMegaBytes(kiloBytes);
            remainingKiloBytes = kiloBytes - (megaBytes * 1024);
        }
        return remainingKiloBytes;
    }
}
