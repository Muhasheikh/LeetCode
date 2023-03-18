package oop.abstraction;

public abstract class Parent {

    int age;
    Parent(){
        System.out.println("From parent class");
    }



    abstract void career(String name);
    abstract void partner(String name,int age);

}
