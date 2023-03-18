package oop.properties.inheritance;

public class Parent {

    public Parent(){
        System.out.println("Calling from the Parent class");

    }

    public Parent(String Nmae){

        System.out.println("Calling from the Parent class " + Nmae);
    }

    @Override
    public String toString() {
        return "Parent caling from To string";
    }

     void print(){
        System.out.println("Hi from parent");
    }
}
