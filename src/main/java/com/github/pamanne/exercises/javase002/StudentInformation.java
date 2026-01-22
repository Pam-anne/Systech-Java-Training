package com.github.pamanne.exercises.javase002;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        boolean isGraduating = false;

        System.out.println();

        System.out.println("=== Student Information ===");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age + " years");
        System.out.println("Grade: "+ grade);
        System.out.println("GPA: "+gpa);
        System.out.println("Is Graduating: "+ isGraduating);

        scanner.close();
        
    }
    
}
