package com.github.pamanne.exercises.javase011.exercise1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color,boolean isFilled,double width,double height){
        super(color,isFilled);
        this.width=width;
        this.height=height;

    }
    

    @Override
    public double getArea(){
        double area = width*height;
        System.out.println("Area of the " + color + " rectangle is: "+ area);
        return area;

    }
    @Override
    public double getPerimeter(){
        double perimeter = 2*(width + height);
        System.out.println("Perimeter of the " + color + " rectangle is: "+ perimeter);
        return perimeter;

    }

   
}
