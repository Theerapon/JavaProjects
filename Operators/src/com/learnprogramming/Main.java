package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) =  1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int  topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        topScore += 2;
        if (topScore != 100) {
            System.out.println("You don't get the high score!");
        }

        if (topScore > 100) {
            System.out.println("You got the high score more then 100");
        }

        topScore -= 10;
        if (topScore < 100) {
            System.out.println("You got the high score less then 100");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }

        int newValue = 50;
        //if (newValue = 50) is error, is the assignment operator
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        /*
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }*/
        if (isCar) {
            System.out.println("This Car is true");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is True");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        System.out.println("Age is eighteen or over = " + isEighteenOrOver);

        double doubleVariable = 20.00;
        double secondDoubleVariable = 80.00;
        double resultDouble = (doubleVariable + secondDoubleVariable) * 100.00;
        double remainderOfDouble = resultDouble % 40.00;
        //remainderOfDouble = (100.00 * 100.00) % 40.00 = 0
        boolean booVariable = (remainderOfDouble == 0) ? true : false;

        System.out.println("Boolean = " + booVariable);

        if (booVariable != true) {
            System.out.println("Got some remainder");
        }

    }
}
