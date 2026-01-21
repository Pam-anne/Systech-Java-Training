package com.github.pamanne.methods;

public class Main {
    public static void main(String[] args) {
       System.out.println("Area: " + calculateCircleArea(5));

       System.out.println("Factorial of "+factorial(5));
       System.out.println(MathHelper.add(2.0,3.0,4.0));
        
    }

    public static double calculateCircleArea(double radius){
        final double PI =3.14159;
        double result= PI*radius*radius;
        return result;
 
    }
    
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
}
