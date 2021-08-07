package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //String numberAsString = "2018a"; => can't convert to int
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number + number = " + (number + number));

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("double number = " + doubleNumber);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


    }
}
