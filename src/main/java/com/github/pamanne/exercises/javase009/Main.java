package com.github.pamanne.exercises.javase009;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle("blue",true,4.5);
        circle.getArea();
        circle.getPerimeter();
        System.out.println( circle.toString());

        System.out.println();

        Rectangle rectangle =new Rectangle("red",false,4.5,6.6);
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println(rectangle.toString()); 
    }
}
