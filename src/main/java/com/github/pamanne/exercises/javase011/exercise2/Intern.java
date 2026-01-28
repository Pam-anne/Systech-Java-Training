package com.github.pamanne.exercises.javase011.exercise2;

public class Intern extends Employee {

    private String university;
    final double internBonus = 500.0;

    public Intern(String name, String university, int id, double salary) {
        super(name, id, salary);
        setUniversity(university);

    }

    public void setUniversity(String university) {
        if (university != null && !university.isEmpty()) {
            this.university = university;
        } else {
            System.out.println("Error: Intern university  can not be empty or null");
        }
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public double calculateBonus() {
        return internBonus;

    }

     @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee type: Intern");
        System.out.println("University: " + getUniversity());
        System.out.println("Employee Bonus: $" + calculateBonus());
        System.out.println("Employee Salary: $" + getSalary());
        System.out.println("Employee Total Salary: $" + (getSalary() + calculateBonus()) +"\n");
        
    }

}
