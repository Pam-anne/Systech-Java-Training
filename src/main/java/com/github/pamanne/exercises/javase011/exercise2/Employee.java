package com.github.pamanne.exercises.javase011.exercise2;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
     public String getName(){
     return name;
     }

     public int getId(){
     return id;
     }

     public double getSalary(){
     return salary;
     }

     public void setName(String name){
        if(name != null && !name.isEmpty()){
        this.name =name;
        }else{
        System.out.println("Error: Employee name can not be empty or null");
        }
     }

     public void setId(int id){
        if(id >0){
        this.id =id;
        }else{
        System.out.println("Error: Employee id can not be negative");
        }
        
     }

     public void setSalary(double salary){
        if(salary >= 0){
        this.salary =salary;
        }else{
        System.out.println("Error: Employee salary can not be negative");
        }
     }


    public abstract double calculateBonus(); 

    public void displayInfo(){
        System.out.println("\t EMPLOYEE DETAILS");
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
    }
    
}
