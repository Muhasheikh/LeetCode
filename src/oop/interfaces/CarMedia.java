package oop.interfaces;

public class CarMedia implements Media{
    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void stop() {

        System.out.println("Stop music");
    }
}
