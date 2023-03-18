package oop.interfaces;

public class Main {

    public static void main(String[] args) {


        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.startMusic();

        ElectricEngine car3 = new ElectricEngine();

        Car car1 = new Car(car3);
        car1.stopCar();
        car1.startCar();

//
//        CarMedia car1 = new CarMedia();
//        car1.play();
//        car1.stop();





    }
}
