package com.learnprogramming;

public class Bedroom {
    private String name;
    private Wall wallWest;
    private Wall wallEast;
    private Wall wallSouth;
    private Wall wallNorth;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wallWest, Wall wallEast, Wall wallSouth, Wall wallNorth, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wallWest = wallWest;
        this.wallEast = wallEast;
        this.wallSouth = wallSouth;
        this.wallNorth = wallNorth;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
