package com.github.pamanne.exercises.javase009;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color,boolean filled,double width,double height){
        super(color,filled);
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

    @Override
    public String toString(){
        return color+" Rectangle is filled = " + filled;
    }
}
