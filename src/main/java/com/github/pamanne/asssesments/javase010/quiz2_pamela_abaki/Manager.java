package com.github.pamanne.asssesments.javase010.quiz2_pamela_abaki;

public class Manager extends Employee {
    public Manager(String name,int id,double salary){
        super(name,id,salary);
    }

    @Override
    public double calculateBonus(){
        return 0.15 * getSalary();
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
    }
}
