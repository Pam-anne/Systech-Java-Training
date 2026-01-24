package com.github.pamanne.exercises.javase009;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color =color;
        filled = true;

    }

    public double getArea(){
        return 0;
    }
    
    public double getPerimeter(){
        return 0;
    }

    public String tostring(){
        return color+"shape"+ "is filled = " + filled;
    }
    

}
