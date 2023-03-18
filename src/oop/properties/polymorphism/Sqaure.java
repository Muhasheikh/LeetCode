package oop.properties.polymorphism;

public class Sqaure extends Shape{

    static void greeting(){

        System.out.println("Hello world");
    }
    @Override
     void area(){

        System.out.println("The area of square is l * w");
    }
}
