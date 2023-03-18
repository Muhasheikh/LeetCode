package oop.abstraction;

public class Daughter extends Parent{




    @Override
    void career(String name) {
        System.out.println("Calling from daugher");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Calling from daugher");
    }
}
