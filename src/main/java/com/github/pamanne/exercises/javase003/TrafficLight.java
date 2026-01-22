package com.github.pamanne.exercises.javase003;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter traffic light color: ");
        String lightColor = scanner.nextLine();

        String action = switch(lightColor){
            case "red" -> "Stop";
            case "yellow" -> "Prepare to stop";
            case "green" -> "Go";
            case "blinking red" -> "Treat as stop sign";
            case "blinking yellow" -> "Proceed with caution";
            default -> "Invalid traffic light color! Enter one of these colors(red,yellow,green,blinking red,blinking yellow)";
        };
        System.out.println("Action to take is: " + action);

        scanner.close();
        
    }
}
