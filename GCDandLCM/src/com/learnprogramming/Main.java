package com.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("FalSe"));
        list.add(Boolean.TRUE);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println("instanceof: " + (list.get(0) instanceof Boolean));

	    Calculator calculator = new Calculator();
        /*System.out.println(calculator.calcGCDByEuclidean(7632, 273));
        System.out.println(calculator.calcLCMByFormula(7632, 273));*/

        /*System.out.println("GCD By Prime Factors: " + calculator.calcGCDByPrimeFactors(7632, 98123));*/
        /*System.out.println("LCM By Prime Factors: " + calculator.calcLCMByPrimeFactors(42, 234));*/

        /*System.out.println("GCD By Prime Factors: " + calculator.calcGCDByPrimeFactors(718, 729));
        System.out.println("LCM By Prime Factors: " + calculator.calcLCMByPrimeFactors(718, 729));*/

        System.out.println("LCM By Prime Factors: " + calculator.calcLCMByDivisorByPrime(23823, 22982));
        //247041974

        System.out.println("GCD: " + calculator.calcCDG(new long[] {21, 24, 26}));
        System.out.println("LCD: " + calculator.calcLCM(new long[] {21, 24, 26}));

    }
}
