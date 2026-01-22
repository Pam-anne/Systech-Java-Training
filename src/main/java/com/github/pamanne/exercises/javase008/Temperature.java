package com.github.pamanne.exercises.javase008;

public class Temperature {
    private double celsius;

    public Temperature(double celsius){
        setCelsius(celsius);

    }

    public double getCelsius(){
        return celsius;
    }

    public double getFahrenheit(){
        return (celsius * 9/5) +32;
    }

    public double getKelvin(){
        return celsius + 273.15;
    }

    public void setCelsius(double celsius){
        if(celsius >= -273.15){
            this.celsius =celsius;
        }else{
            System.out.println("Error: The minimum temperature to convert is -273.15");
        }
    }
    
     public double convertToFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double convertToKelvin() {
        return celsius + 273.15;
    }

    public void displayTemperature() {
        System.out.println("Celsius: " + getCelsius() + "°C");
        System.out.println("Fahrenheit: " + convertToFahrenheit() + "°F");
        System.out.println("Kelvin: " + convertToKelvin() + "K");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Temperature t1 = new Temperature(0.0);
        t1.displayTemperature();

        t1.setCelsius(-650);
        
    }
}
