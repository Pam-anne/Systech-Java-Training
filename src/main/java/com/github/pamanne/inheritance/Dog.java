package com.github.pamanne.inheritance;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println(super.name +"A dog barks");
        
    }

    public void makSOund2(){
        super.makeSound();
    }
}
