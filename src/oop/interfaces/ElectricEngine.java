package oop.interfaces;

public class ElectricEngine implements  Engine {
    @Override
    public void start() {
        System.out.println("I start like an Electric Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like an Electric Car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like an Electric Car");
    }
}
