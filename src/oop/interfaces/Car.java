package oop.interfaces;

public class Car{

    private Engine engine;
    private Media media = new CarMedia();
    Car(){
        engine = new CarEngine();
    }

    Car(Engine engine){

        this.engine =engine;
    }

    public void startCar(){
        engine.start();
    }
    public void stopCar(){
        engine.stop();
    }

    public void startMusic(){
        media.play();
    }



}
