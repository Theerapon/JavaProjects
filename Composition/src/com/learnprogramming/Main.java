package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("200B", "Dell", "240", dimensions);

	    Monitor theMoniter = new Monitor("27inch Beast", "Acer", 27, new Resolution(1920, 1080));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v.44");

        PC thePC = new PC(theCase, theMoniter, theMotherboard);
        thePC.powerUp();

    }
}
