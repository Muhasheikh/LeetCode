package oop.abstraction;

public class Child extends Parent{

    public Child() {
        super();

    }

    @Override
    void career(String name) {
        System.out.println("My dream job is " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My dream parnter is " + name + " and her age is "+ age);
    }



}
