package com.github.pamanne.exercises.javase011.exercise2;

public class Manager extends Employee {

    private String department;

    public Manager(String name, String department, int id, double salary) {
        super(name, id, salary);
        setDepartment(department);

    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Error: Manager department  can not be empty or null");
        }
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double calculateBonus() {
        return 0.15 * getSalary();

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee type: Manager");
        System.out.println("Department: " + getDepartment());
        System.out.println("Employee Bonus: $" + calculateBonus());
        System.out.println("Employee Salary: $" + getSalary());
        System.out.println("Employee Total Salary: $" + (getSalary() + calculateBonus()) + "\n");

    }
}
