package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int realiseYear) {
        super(realiseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows turned off");
    }
}