package com.aashish.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();


//        car.acc();
//        car.start();
//        car.stop();

//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar Car = new NiceCar();

        Car.start();
        Car.startMusic();
        Car.upgradeEngine();
        Car.start();
    }
}
