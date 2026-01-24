package com.github.pamanne.asssesments.javase010.quiz3_pamela_abaki;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Basic Calculator Output:");
        System.out.println("Method add(int, int): " + calculator.add(26, 10));
        System.out.println("Method add(double, double): " + calculator.add(8.5, 3.7));
        System.out.println("Method add(int, int, int): " + calculator.add(10, 12, 65));
        System.out.println("Method add(String, String): " + calculator.add("Thank you, ", "for using my calculator!")+"\n");
        


        ScientificCalculator scientific = new ScientificCalculator();
        System.out.println("Scientific Calculator Output:");
        System.out.println("Method add(int, int): " + scientific.add(5, 10)); 
        System.out.println("Method power(base, exponent): " + scientific.power(4, 3));
        System.out.println("Method squareRoot(num): " + scientific.squareRoot(64));
        
        
    }
    
}
