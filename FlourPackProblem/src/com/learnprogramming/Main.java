package com.learnprogramming;

import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    private static final int INST_KILOS_PER_BIG_BAGS = 5;
    private static final int INST_KILOS_PER_SMALL_BAGS = 1;

    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean canPack = false;
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int sum = (bigCount * INST_KILOS_PER_BIG_BAGS) + (smallCount * INST_KILOS_PER_SMALL_BAGS);
            canPack = ((sum >= goal) && (goal % INST_KILOS_PER_BIG_BAGS <= smallCount)) ? true : false;
        }
        return canPack;
    }

}
