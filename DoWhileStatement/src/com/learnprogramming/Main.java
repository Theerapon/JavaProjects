package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        TestWhileStatement();

        int number = 4;
        int finishNumber = 20;
        String totalNumber = "";
        int countEvenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            //System.out.println("Even Number " + number);
            totalNumber +=  number + ", ";
            countEvenNumbersFound++;
            if (countEvenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("First 5 Numbers be Even Number are = " + totalNumber);
    }

    public static void TestWhileStatement() {

        int count = 1;
        while (count < 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.println("Count value is " + i);
        }
        System.out.println();

        count = 1;
        while (true) {
            if(count > 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println();

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count < 6);
        System.out.println();

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;

        } while (count < 6);
        System.out.println();
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0) ? true : false;
    }
}
