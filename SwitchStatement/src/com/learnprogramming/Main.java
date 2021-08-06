package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

	    /*int value = 3;
	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

	    int switchValue = 1;
	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case  2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char character = 'E';
        switch((int)character) {
            case 65: case 66: case 67: case 68: case 69:
                System.out.printf("%c was found\n", character);
                break;
            default:
                System.out.printf("%c Not found\n", character);
                break;
        }

        String playerName = "ThEeRapon";
        switch(playerName.toLowerCase()) {
            case "theerapon":
                System.out.println("Hello, Theerapon");
                break;
            case "faii":
                System.out.println("Bye Bye, Faii");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
