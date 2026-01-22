package com.github.pamanne.exercises.javase004;

import java.util.Scanner;

public class NumberStatisics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        while(true){
            System.out.print("Enter number (0 to stop):");
            number = scanner.nextInt();

            if (number == 0 ){
                break;
            }
            if (number < 0 ){
                continue;
            }
            sum +=number; 
            count+=1;
        }
        double average = (double)sum/count;
        System.out.println("Sum: "+ sum +", Count: "+ count +", Average: " + average);

        scanner.close();

        
    }
}
