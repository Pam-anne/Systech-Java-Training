package com.github.pamanne.asssesments.javase010.quiz2_pamela_abaki;

public class Developer extends Employee {

    public Developer(String name,int id,double salary){
        super(name,id,salary);
    }

    @Override
    public double calculateBonus(){
        return 0.1 *getSalary();
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        
    }
    
}
