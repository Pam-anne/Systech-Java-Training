package com.github.pamanne.exercises.javase004;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for(int i =1; i<=10; i++){
            int result = i*number;
            System.out.println(number + " X " + i + " = " + result);
        }

        scanner.close();
    }
    
}
