package com.learnprogramming;

public class Main {

    private static final double PI  = Math.PI;

    public static void main(String[] args) {

        printCircleArea(5);
        printRectangleArea(5, 4);
    }

    public static double Area(double radius) {
        double area = -1.0;
        if (radius >= 0) {
            area = PI * (Math.pow(radius, 2));
        }
        return area;
    }

    public static double Area(double x, double y) {
        double area = -1.0;
        if (x >= 0 && y >= 0) {
            area = x * y;
        }
        return  area;
    }

    public static void printCircleArea(double radius) {
        System.out.printf("%s radius = %.2f areas\n", radius, Area(radius));
    }

    public static void printRectangleArea(double x, double y) {
        System.out.printf("%s x, %s y = %.2f areas\n", x, y, Area(x, y));
    }
}
