package com.github.pamanne.variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = scanner.nextDouble();


        System.out.print("Enter second number: ");
        double secondNum = scanner.nextDouble();

        System.out.println("Results: ");
        System.out.println(firstNum + " + " + secondNum + " = " +(firstNum + secondNum));
        System.out.println(firstNum +  " - " + secondNum + " = " +(firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " +(firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " +(firstNum / secondNum));
        System.out.println(firstNum + " % " + secondNum  + " = "  +(firstNum % secondNum));

        scanner.close();
        
    }
    
}
