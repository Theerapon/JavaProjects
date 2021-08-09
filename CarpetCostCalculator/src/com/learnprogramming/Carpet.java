package com.learnprogramming;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        setCost(cost);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

}
