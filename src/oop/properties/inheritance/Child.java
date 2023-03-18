package oop.properties.inheritance;

public class Child extends  Parent{

    public Child(String name){

        super.print();
        System.out.println("Calling from the child class " + name);
    }


    public String toStrings() {
        return "Chjild caling from To string";
    }

     void print(){
        System.out.println("Hi from Child");
    }
}
