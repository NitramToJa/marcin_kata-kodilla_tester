package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem{
    public MacOs(int realiseYear) {
        super(realiseYear);
    }
    public void turnOn() {
        System.out.println("macOs turned on");
    }

    public void turnOff() {
        System.out.println("macOs turned off");
    }

}
