package com.github.pamanne.exercises.javase013.exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter operator (+, -, *, /): ");
                String operator = scanner.nextLine();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                scanner.nextLine();

                double result = Calculator.calculate(num1, num2, operator);
                System.out.println("Result: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid number format. Please enter numeric values.");
            } catch (InvalidOperationException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.print("Do you want to continue? (yes/no): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (!choice.equals("yes")) {
                    continueCalculation = false;
                    System.out.println("Calculator closing....");
                }
            }
            
        }
        scanner.close();
    }
}
