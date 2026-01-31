package com.github.pamanne.exercises.javase013.exercise3;

public class Calculator {

    public static double calculate(double num1, double num2, String operator) throws InvalidOperationException {

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0){
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                result = num1 / num2;
                break;

            default:
                throw new InvalidOperationException("Invalid operator! Use +, -, *, or /.");
        }

        if (Double.isInfinite(result) || Double.isNaN(result))
            throw new ArithmeticException("Result overflow or invalid number.");

        return result;
    }
}
