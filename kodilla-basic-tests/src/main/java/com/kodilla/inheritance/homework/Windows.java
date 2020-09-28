package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int realiseYear) {
        super(realiseYear);
    }

    public void turnOn() {
        System.out.println("Windows turned on");
    }

    public void turnOff() {
        System.out.println("Windows turned off");
    }
}