package com.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();



        System.out.println("Your name = " + name);
        System.out.println("Your age = " + age);
        scanner.close();
    }
}
