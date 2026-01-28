package com.github.pamanne.exercises.javase011.exercise1;

public class Circle extends Shape {
    private double radius;

    public Circle(String color,boolean isFilled,double radius){
        super(color,isFilled);
        this.radius =radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI *radius*radius;
        System.out.println("Area of the " + color + " circle is: "+ area);
        return area;
        

    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * Math.PI *radius;
        System.out.println("Perimeter of the " + color + " circle is: "+ perimeter);
        return perimeter;

    }
   
  
}
