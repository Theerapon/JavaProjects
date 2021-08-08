package com.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countNumber = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            countNumber++;
        }

        System.out.println("SUM = " + sum + " AVG = " +  Math.round(((double) sum / countNumber)));
        scanner.close();
    }
}
