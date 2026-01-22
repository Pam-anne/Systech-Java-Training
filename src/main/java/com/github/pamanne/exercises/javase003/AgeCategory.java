package com.github.pamanne.exercises.javase003;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age =scanner.nextInt();


        if(age>=65){
            System.out.println("Category: Senior");
        }else if (age>=20){
            System.out.println("Category: Adult");
        }else if (age>=13){
            System.out.println("Category: Teenager");
        }else if (age>=3){
            System.out.println("Category: Child");
        }else if (age>=0){
            System.out.println("Category: Infant");
        }else{
            System.out.println("Age must be greater than 0");
        }

        scanner.close();

        
    }
    
}
