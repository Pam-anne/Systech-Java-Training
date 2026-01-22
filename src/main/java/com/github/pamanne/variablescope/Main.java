package com.github.pamanne.variablescope;

public class Main {
    public static void main(String[] args) {
        System.out.println("Path: " + config);
        printVariables();
        
    }

    // class variable
    public static String config ="/home/user";

    public static void printVariables(){
        System.out.println("Path: "+config);
    }

    public static void carInfo(){
        Car car = new Car();
        car.id =11;
        car.color="red";
        car.model="BMW";
    }
}
