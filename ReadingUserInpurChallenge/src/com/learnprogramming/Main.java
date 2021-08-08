package com.learnprogramming;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int maxInput = 10;
	    while (count < maxInput) {

            System.out.printf("Enter number #%d: ", count + 1);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");

            }

            scanner.nextLine();
        }

        System.out.println("Sum = " + sum);
	    scanner.close();
    }

}
