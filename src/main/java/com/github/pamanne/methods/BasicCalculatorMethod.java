package com.github.pamanne.methods;

public class BasicCalculatorMethod {
    public static void main(String[] args) {
        System.out.println("Addition: 5 + 3 = " + add(5,3));
        System.out.println("Subtraction: 5 - 3 = " + subtraction(5,3));
        System.out.println("Multiplication: 5 * 3 = " + multiplication(5,3));
        System.out.println("Division: 5 / 3 = " + division(5,3));
        System.out.println("Division by zero: 5 / 0 = " + division(5,0));
        
    }



    public static double add(double num1,double num2){
        return num1+num2;
    }

    public static double subtraction(double num1,double num2){
        return num1-num2;
    }

    public static double multiplication(double num1,double num2){
        return num1*num2;
    }

    public static double division(double num1,double num2){
        if(num2 == 0){
            System.out.println("Can not divide by zero");
            return 0;
        }
        return num1/num2;
    }


}
