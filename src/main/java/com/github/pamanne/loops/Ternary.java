package com.github.pamanne.loops;

public class Ternary {
    public static void main(String[] args) {
        int x =100;
        int a =x++;
        int b=++x;
        int c = x++;
        int d= (a<b) ? (a<c) ? a: (b<c) ? b:c :x;
        System.out.println(d);
        
    }
    // public String message(){
    //     String status ="pending";

    // }
}
