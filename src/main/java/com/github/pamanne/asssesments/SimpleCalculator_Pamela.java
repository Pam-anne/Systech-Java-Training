/*
* Simple Console Calculator
* Student Name: [Your Name]
* Date: [Submission Date]
*
* Features:
* - Basic arithmetic operations
* - Continuous operation
* - Error handling for division by zero
* - Input validation
*
* Bonus Features: 
* Additional Operations: Modulus
*/

package com.github.pamanne.asssesments;

import java.util.Scanner;


public class SimpleCalculator_Pamela {
    public static void main(String[] args) {
        System.out.println("  === Simple Calculator === ");

        Scanner scanner =new Scanner(System.in);
        boolean continueCalculating = true;

        while(continueCalculating){
            System.out.println("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Modulus
                6. Exit""");

            System.out.print("Enter your choice (1-6): ");
            int choice =scanner.nextInt();

            if (choice == 6) {
                continueCalculating = false;
                System.out.println("Exiting calculator. Thank you for using the calculator!");
                continue;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }


            System.out.print("Enter first number: ");
            double firstNum = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double secondNum = scanner.nextDouble();

            
            char operator = ' ';
            double result = 0;
             switch (choice) {
                case 1 -> {
                    operator = '+';
                    result = firstNum + secondNum;
                }
                case 2 -> {
                    operator = '-';
                    result = firstNum - secondNum;
                }
                case 3 -> {
                    operator = '*';
                    result = firstNum * secondNum;
                }
                case 4 -> {
                    operator = '/';
                    if (secondNum == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue; 
                    }
                    result = firstNum / secondNum;
                }
                case 5 -> {
                    operator = '%';
                    result = firstNum % secondNum;
                }
            }

            System.out.println("Result: " + firstNum + " " + operator + " " + secondNum + " = " + result);

            System.out.print("Would you like to perform another calculation? (y/n): ");
            char anotherCalculation = scanner.next().toLowerCase().charAt(0);
            if (anotherCalculation != 'y') {
                continueCalculating = false;
                System.out.println("Exiting calculator. Thank you for using the calculator!");
            }


        }
        
 
        
        scanner.close();

    }
    
}
