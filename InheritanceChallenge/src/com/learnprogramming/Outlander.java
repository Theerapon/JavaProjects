package com.learnprogramming;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changGear(3);
        } else {
            changGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
