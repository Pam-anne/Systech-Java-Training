package com.github.pamanne.exercises.javase008;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId, String name, int age, double gpa) {
    setStudentId(studentId);
    setStudentName(name);
    setStudentAge(age);
    setStudentGpa(gpa);
}


    // getters
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return name;
    }

    public int getStudentAge() {
        return age;
    }

    public double getStudentGpa() {
        return gpa;
    }

    // setters
    public void setStudentId(String studentId) {
        if (studentId != null && studentId.matches("[A-Za-z0-9]{6}")) {
            this.studentId = studentId;
        } else {
            System.out.println("Error: Student ID must be 6 letters/numbers (alphanumeric).");
        }

    }

    public void setStudentName(String name) {
        if (name != null && name.trim().length() >= 2) {
            this.name = name.trim();
        } else {
            System.out.println("Error: Student name must be at least 2 characters");
        }

    }

    public void setStudentAge(int age) {
        if(age >= 16 && age <=100){
            this.age = age;
        }else{
            System.out.println("Error: Student age must be between 16 and 100");
        }

    }

    public void setStudentGpa(double gpa) {
        if(gpa >= 0.0 && gpa <=4.0){
            this.gpa = gpa;
        }else{
            System.out.println("Error: Student gpa must be between 0.0 and 4.0");
        }

    }

    public void displayInfo(){
         System.out.println("======= STUDENT  DETAILS =======");
        System.out.println("Student ID is: " + studentId);
        System.out.println("Student name is: " + name);
        System.out.println("Student age is: " + age);
        System.out.println("Student gpa is: " + gpa);
        System.out.println();
    }


    public static void main(String[] args) {
        Student s1 = new Student("12","Pamela",20,0.4);
        Student s2 = new Student("B12"," ",20,0.4);
        Student s3 = new Student("b12","Pamela",15,5.4);
        Student s4 = new Student("b12125","Pamela",20,3.4);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
    }
}
