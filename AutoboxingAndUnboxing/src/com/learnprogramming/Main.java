package com.learnprogramming;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
            String[] strArray = new String[10];
            int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

    // ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.24);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56); // autoboxing // primitive type to object class
        int myInt  = myIntValue; // myIntValue.intValue(); // unboxing  // object class to primitive type

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double db = 0.0; db <= 10.0; db += 0.5) {
            myDoubleValues.add(Double.valueOf(db));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).intValue();
            System.out.println(i + " --> " + value);
        }
    }
}
