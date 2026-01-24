package com.github.pamanne.exercises.javase009;

public class Circle extends Shape {
    private double radius;

    public Circle(String color,boolean filled,double radius){
        super(color,filled);
        this.radius =radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI *radius*radius;
        System.out.println("Perimeter of the " + color + " circle is: "+ area);
        return area;
        

    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * Math.PI *radius;
        System.out.println("Perimeter of the " + color + " circle is: "+ perimeter);
        return perimeter;

    }
    @Override
    public String toString(){
        return color+" Circle is filled = " + filled;
    }
  
}
