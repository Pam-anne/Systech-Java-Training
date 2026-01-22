package com.github.pamanne.exercises.javase006;

public class TemperatureConverter {
    public static void main(String[] args) {
        printTemperatureTable();
        
    }

    public static double celsiusToFahrenheit(double celsius){
        return celsius * (9/5) +32;

    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * (5/9);


    }

    public static void printTemperatureTable(){
        System.out.println("Conversion table from Celsius to Fahrenheit:");
        for (int celsius= 0;celsius<=100;celsius +=10){
            System.out.println(celsiusToFahrenheit(celsius));

        }


    }
    
}
