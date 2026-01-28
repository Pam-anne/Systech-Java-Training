package com.github.pamanne.exercises.javase011.exercise1;

public class Main {
    public static void main(String[] args) {
        Shape rectangle =new Rectangle("yellow",true,2.6,8.2);
        Shape circle =new Circle("blue",false,6.3);
        Shape triangle = new Triangle("green",true,7.0,5.6);

        // polymorphic behaviour
        System.out.println(" Area and Perimeter of a Rectangle: ");
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println("\n Area and Perimeter of a Circle: ");
        circle.getArea();
        circle.getPerimeter();
        System.out.println("\n Area and Perimeter of a Triangle: ");
        triangle.getArea();
        triangle.getPerimeter();
    }
}
