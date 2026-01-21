// Pamela Abaki

package com.github.pamanne.asssesments;

import java.util.Scanner;

public class Assessment1_Pamela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiz Problem 1:");
        variableOperations();

        System.out.println();
        System.out.println("Quiz Problem 2:");
        gradeCalculator(scanner);

        System.out.println();
        System.out.println("Quiz Problem 3:");
        numberSequence();

        System.out.println();
        System.out.println("Quiz Problem 4:");
        inputValidation(scanner);

        System.out.println();
        System.out.println("Quiz Problem 5:");
        patternPrinting();

        scanner.close();

    }

    // Quiz Problem 1: Variable Operations
    static void variableOperations() {
        int a = 15, b = 4, c = 7;
        System.out.println("Sum: " + (a + b + c));
        System.out.println("Product: " + (a * b));
        System.out.println("Expression Result: " + ((a + b) * c));
        System.out.println("Remainder: " + (a % b));

    }

    // Quiz Problem 2: Grade Calculator
    static void gradeCalculator(Scanner scanner) {
        System.out.print("Enter student score: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }

    // Quiz Problem 3: Number Sequence
    static void numberSequence(){

        for(int i =1;i<=20;i++){
            if(i%2==0){
                System.out.print(i + " - Even ");
            } else{
                System.out.print(i + " - Odd");
            }

            if(i%5 == 0){
                System.out.print(", Multiple of 5");
            }

             System.out.println(); 

    }
    }

    // Quiz Problem 4: Input Validation
    static void inputValidation(Scanner scanner){
        int number = 0;
        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();

        while(number<=0){
            System.out.print("Invalid input! Please enter a positive integer: ");
            number = scanner.nextInt();
            }

        long factorial =1;
        for  (int i =1; i<=number; i++){
            factorial *=i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
            

    }

    // Quiz Problem 5: Pattern Printing
    static void patternPrinting(){
        for (int i =1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
