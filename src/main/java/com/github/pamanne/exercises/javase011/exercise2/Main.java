package com.github.pamanne.exercises.javase011.exercise2;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Anne","Software Development",1,20000.0);
        Employee developer = new Developer("Pam","Java",2,15000.0);
        Employee intern = new Intern("Sharon","Nairobi University",3,200.0);

        manager.displayInfo();
        developer.displayInfo();
        intern.displayInfo();
        
    }
}
