package com.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter count:");

        int[] returnedArray = readElements(readInteger());
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.nextLine();
        return capacity;
    }

    private static int[] readElements(int values) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[values];
        for(int i=0; i<elements.length; i++) {
            int totalElementEntered = scanner.nextInt();
            scanner.nextLine();
            elements[i] = totalElementEntered;
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
