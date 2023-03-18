package oop.properties.polymorphism;

public class Main {

    public static void main(String[] args) {

        //Shape shape = new Shape();
        Circle circle = new Circle();
        Shape square = new Sqaure();


        square.area();

        Sqaure.greeting();

        circle.area();
    }
}
