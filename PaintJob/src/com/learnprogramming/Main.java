package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(getBucketCount(3.4, 2.1, 1.5));

        System.out.println(getBucketCount(6.26, 2.2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketCount = -1;
        if (width <= 0d || height <= 0d || areaPerBucket <= 0d || extraBuckets < 0) {
            return bucketCount;
        }

        double area = width * height;
        bucketCount = (int) Math.ceil(area / areaPerBucket);
        return bucketCount - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketCount = -1;
        if (width <= 0d || height <= 0d || areaPerBucket <= 0d ) {
            return bucketCount;
        }

        double area = width * height;
        bucketCount = (int) Math.ceil(area / areaPerBucket);

        return bucketCount;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketCount = -1;
        if (area <= 0d || areaPerBucket <= 0d ) {
            return bucketCount;
        }

        bucketCount = (int) Math.ceil(area / areaPerBucket);
        return bucketCount;
    }
}
