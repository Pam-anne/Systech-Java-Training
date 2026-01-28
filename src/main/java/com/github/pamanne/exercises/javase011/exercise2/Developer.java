package com.github.pamanne.exercises.javase011.exercise2;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String programmingLanguage, int id, double salary) {
        super(name, id, salary);
        setProgrammingLanguage(programmingLanguage);

    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage != null && !programmingLanguage.isEmpty()) {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.out.println("Error: Developer programmingLanguage  can not be empty or null");
        }
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return 0.1 * getSalary();

    }

   

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee type: Developer");
        System.out.println("Programming Language: " + getProgrammingLanguage());
        System.out.println("Employee Bonus: $" + calculateBonus());
        System.out.println("Employee Salary: $" + getSalary());
        System.out.println("Employee Total Salary: $" + (getSalary() + calculateBonus()) +"\n");
        
    }

}
