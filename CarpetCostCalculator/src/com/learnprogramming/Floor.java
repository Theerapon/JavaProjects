package com.learnprogramming;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setLength(double length) {
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
