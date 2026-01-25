package com.github.pamanne.asssesments.javase010.part1_pamela_abaki.quiz2_pamela_abaki;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);

    }

    // getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Employee name cannot be empty or null");
        }

    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Error: Employee ID must be greater than 0");
        }

    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Employee Salary can not be negative");
        }

    }

    public double calculateBonus() {
        return 0.05 * salary;
    }

    public double getTotalSalary() {
        return getSalary() + calculateBonus();
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " +getTotalSalary()+"\n");
    }

}
