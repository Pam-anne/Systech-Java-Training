package com.github.pamanne.asssesments.javase010.part1_pamela_abaki.quiz3_pamela_abaki;

public class ScientificCalculator extends Calculator {
    // overriding
    @Override
    public int add(int a, int b) {
        System.out.println("Using Scientific Calculator to add two integers: ");
        return super.add(a,b);
    }

    public double power(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);

    }
}
