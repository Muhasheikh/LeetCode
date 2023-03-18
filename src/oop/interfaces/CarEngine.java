package oop.interfaces;

public class CarEngine implements Engine{


    CarEngine(){
        System.out.println("Ready to rock Brother");
    }
    @Override
    public void start() {
        System.out.println("Start like a car");
    }

    @Override
    public void stop() {
        System.out.println("Stops like a car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like a car");
    }
}
