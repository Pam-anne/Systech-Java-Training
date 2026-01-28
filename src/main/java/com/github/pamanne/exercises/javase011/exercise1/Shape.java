package com.github.pamanne.exercises.javase011.exercise1;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

     public Shape(String color, boolean isFilled){
        this.color = color;
        isFilled = true;

    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return color+"shape"+ "is filled = " + isFilled;

    }
    
}
