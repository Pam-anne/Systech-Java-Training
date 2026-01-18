package com.github.pamanne.loops;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers: ");

        for (int num = 2; num <= 20; num++) { 
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}

