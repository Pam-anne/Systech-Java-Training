package com.github.pamanne.exercises.javase003;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter operator (+,-,*,/, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double secondNum = scanner.nextDouble();

        double result = switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero!");
                    yield 0;
                }
                yield firstNum / secondNum;
                }
            case '%' -> firstNum % secondNum;
            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };

        System.out.println("Result: " + result);
        scanner.close();

    

    }
    
}
