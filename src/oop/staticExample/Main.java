package oop.staticExample;

public class Main {

    public static void main(String[] args) {


        Human h1 = new Human(22,"Muhassan",200,false);
        Human.message();
        System.out.println( Human.population);

        Main m= new Main();
        m.greetings();
    }

    //we know that somethinf which is not static belongs to an object.
    void greetings(){
        fun();
        System.out.println("Hello World");
    }

    static void fun(){


    }
}
