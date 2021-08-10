package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Wall wallWest = new Wall("West");
        Wall wallEast = new Wall("East");
        Wall wallSouth = new Wall("South");
        Wall wallNorth = new Wall("North");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Fakie", wallWest, wallEast, wallSouth, wallNorth, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
