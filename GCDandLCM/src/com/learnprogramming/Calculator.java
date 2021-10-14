package com.learnprogramming;

import java.util.*;

public class Calculator {

    public long calcGCDByEuclidean(long firstNumber, long secondNumber) {

        if (secondNumber == 0) {
            return firstNumber;
        }

        return calcGCDByEuclidean(secondNumber, firstNumber % secondNumber);
    }

    public long calcLCMByFormula(long firstNumber, long secondNumber) {
        return (long)Math.abs(firstNumber * secondNumber) / calcGCDByEuclidean(firstNumber, secondNumber);
    }

    public long calcLCMByFormula(long firstNumber, long secondNumber, long gcdValue) {
        return (long)Math.abs(firstNumber * secondNumber) / gcdValue;
    }

    public long calcGCDByPrimeFactors(int firstNumber, int secondNumber) {

        if (firstNumber <= 0 || secondNumber <= 0) {
            return -1;
        }

        // find prime factors for both numbers
        List<Integer> firstPrimeFactors = getPrimeFactors(firstNumber);
        List<Integer> secondPrimeFactors = getPrimeFactors(secondNumber);

        boolean startFirstNumber = (firstPrimeFactors.size() < secondPrimeFactors.size()) ? true : false;

        int gcd = 1;
        if (startFirstNumber) {

            for (int i = 0; i < firstPrimeFactors.size(); i++) {
                for (int j = 0; j < secondPrimeFactors.size(); j++) {
                    if (firstPrimeFactors.get(i) == secondPrimeFactors.get(j)) {
                        gcd *= firstPrimeFactors.get(i);
                        secondPrimeFactors.remove(j);
                        firstPrimeFactors.remove(i);
                        break;
                    }
                }
            }

        } else {
            for (int i = 0; i < secondPrimeFactors.size(); i++) {
                for (int j = 0; j < firstPrimeFactors.size(); j++) {
                    if (secondPrimeFactors.get(i) == firstPrimeFactors.get(j)) {
                        gcd *= secondPrimeFactors.get(i);
                        firstPrimeFactors.remove(j);
                        secondPrimeFactors.remove(i);
                        break;
                    }
                }
            }
        }

        return gcd;
    }

    public long calcLCMByPrimeFactors(int firstNumber, int secondNumber) {

        if (firstNumber <= 0 || secondNumber <= 0) {
            return -1;
        }

        // find prime factors for both numbers
        List<Integer> firstPrimeFactors = getPrimeFactors(firstNumber);
        List<Integer> secondPrimeFactors = getPrimeFactors(secondNumber);
        int firstPrimeFactorsSize = firstPrimeFactors.size();
        int secondPrimeFactorsSize = secondPrimeFactors.size();

        // set to pow form
        HashMap<Integer, Integer> dictFirstPrimeFactors = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> dictSecondPrimeFactors = new HashMap<Integer, Integer>();
        for (int i = 0; i < firstPrimeFactorsSize; i++) {
            int value = firstPrimeFactors.get(i);
            if (!dictFirstPrimeFactors.containsKey(value)) {
                dictFirstPrimeFactors.put(value, 1);
            } else {
                int valueFormDict = dictFirstPrimeFactors.get(value) + 1;
                dictFirstPrimeFactors.put(value, valueFormDict);
            }
        }
        for (int i = 0; i < secondPrimeFactorsSize; i++) {
            int value = secondPrimeFactors.get(i);
            if (!dictSecondPrimeFactors.containsKey(value)) {
                dictSecondPrimeFactors.put(value, 1);
            } else {
                int valueFormDict = dictSecondPrimeFactors.get(value) + 1;
                dictSecondPrimeFactors.put(value, valueFormDict);
            }
        }

        int lcm = 1;
        // check value
        for (Map.Entry mapElement : dictFirstPrimeFactors.entrySet()) {
            int key = (int) mapElement.getKey();
            int value = (int) mapElement.getValue();

            if (dictSecondPrimeFactors.containsKey(key)) {
                int valueSecond = dictSecondPrimeFactors.get(key);
                if (value > valueSecond) {
                    lcm *= Math.pow(key, value);
                } else {
                    lcm *= Math.pow(key, valueSecond);
                }
                dictSecondPrimeFactors.remove(key);
            } else {
                lcm *= Math.pow(key, value);
            }
        }

        if (dictSecondPrimeFactors.size() != 0) {
            for (Map.Entry mapElement : dictSecondPrimeFactors.entrySet()) {
                int key = (int) mapElement.getKey();
                int value = (int) mapElement.getValue();
                lcm *= Math.pow(key, value);
            }
        }

        return lcm;
    }

    private List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                primeFactors.add(i);
                i--;
            }
        }
        return primeFactors;
    }

    public long calcGCDByDivisorByPrime(int firstNumber, int secondNumber) {

        if (firstNumber <= 0 && secondNumber <= 0) {
            return -1;
        }

        int gcd = 1;
        boolean canDivisorByPrime = true;
        while (canDivisorByPrime) {

            for (int i = 2; i <= firstNumber && i <= secondNumber; i++) {
                if (isPrime(i) && firstNumber % i == 0 && secondNumber % i == 0) {
                    firstNumber /= i;
                    secondNumber /= i;
                    gcd *= i;
                    i--;
                }
            }
            canDivisorByPrime = false;
        }
        return (long) gcd;
    }

    public long calcLCMByDivisorByPrime(int firstNumber, int secondNumber) {

        if (firstNumber <= 0 || secondNumber <= 0) {
            return -1;
        }

        int lcm = 1;
        boolean canDivisorByPrime = true;
        while (canDivisorByPrime) {

            for (int i = 2; i <= firstNumber && i <= secondNumber; i++) {
                if (isPrime(i) && firstNumber % i == 0 && secondNumber % i == 0) {
                    firstNumber /= i;
                    secondNumber /= i;
                    lcm *= i;
                    i--;
                }
            }
            canDivisorByPrime = false;
        }
        return (long) lcm * firstNumber * secondNumber;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < Math.abs(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long calcCDG(long[] numbers) {
        for (int i = 0; i < (numbers.length - 1); i++) {
            numbers[i+1] = (long) calcGCDByEuclidean(numbers[i], numbers[i+1]);
        }
        return numbers[numbers.length - 1];
    }

    public long calcLCM(long[] numbers) {
        for (int i = 0; i < (numbers.length - 1); i++) {
            numbers[i+1] = (long) calcLCMByFormula(numbers[i], numbers[i+1]);
        }
        return numbers[numbers.length - 1];
    }
}
