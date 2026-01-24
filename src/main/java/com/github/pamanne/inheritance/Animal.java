package com.github.pamanne.inheritance;

public class Animal {
    
    protected String name;

    public Animal(String name){
        this.name =name;
    }

    public String getName(){
        return this.name;
    }

    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
