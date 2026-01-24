package com.github.pamanne.asssesments.javase010.quiz2_pamela_abaki;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("James J",1,50000.0);
        Developer developer1 =new Developer("Purity P",2,30000.0);
        // Employee employee1 =new Employee("Rome R",3,15000.0);

        manager1.displayInfo();
        developer1.displayInfo();
        // employee1.displayInfo();

        // validation testing
        Manager manager2 = new Manager("",1,50000.0);
        Developer developer2 =new Developer("Felix",-2,30000.0);
        Developer developer3 =new Developer("Mart",4,-1);

    }
    
}
