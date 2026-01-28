package com.github.pamanne.exercises.javase011.exercise1;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color,boolean isFilled,double base,double height){
        super(color,isFilled);
        this.base=base;
        this.height=height;

    }
    

    @Override
    public double getArea(){
        double area = 0.5*base*height;
        System.out.println("Area of the " + color + " rectangle is: "+ area);
        return area;

    }
    @Override
    public double getPerimeter(){
        double hypotenuse = Math.sqrt(base * base + height * height);
        double perimeter = base + height + hypotenuse;
        System.out.println("Perimeter of the " + color + " rectangle is: "+ perimeter);
        return perimeter;

    }
    
}
