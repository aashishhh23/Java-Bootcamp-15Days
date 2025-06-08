package com.aashish.interfaces.devices;

public class SmartPhone implements  Camera, Phone, MusicPlayer{
    public static Object makeCall;

    @Override
    public void takePhoto() {
        System.out.println("Capture photo with SmartPhone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Capture video with SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music with SmartPhone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music with SmartPhone");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Make Call with SmartPhone");

    }

    @Override
    public void endCall() {
        System.out.println("end Call with SmartPhone");

    }
}
