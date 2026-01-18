package com.github.pamanne.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number == 3) {
                System.out.println("Found it");
                break;
            }

        }


        loopArray();
        passwordValidation(scanner);
        numberGuess(scanner);

        scanner.close();

    }

    static void loopArray() {
        System.out.println("Even numbers:");
        for (int i = 2; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    static void passwordValidation(Scanner scanner) {
        String password = "pass123";

        System.out.print("Enter password: ");
        String guessPass = scanner.nextLine(); 

        while (!guessPass.equals(password)) {
            System.out.print("Wrong password! Try again: ");
            guessPass = scanner.nextLine(); 
        }

        System.out.println("You got it right!");
    }

    static void numberGuess(Scanner scanner){
        int number =10;
        int guess = 0;
        while(guess != number){
            System.out.print("Guess the number: ");
            guess =scanner.nextInt();

        }
        System.out.println("You guessed it right,you guessed "+guess+" and the right number is "+number);



    }

}
