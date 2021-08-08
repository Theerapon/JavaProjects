package com.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {

            int age = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (age > 0 && age <= 100) {
                System.out.println("Your name = " + name + ", age = " + age);
            } else {
                System.out.println("Invalid age");
            }
        } else {
            System.out.println("Unable to parse age");
        }



        scanner.close();
    }
}
