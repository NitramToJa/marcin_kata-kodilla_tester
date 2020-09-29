package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem{
    public MacOs(int realiseYear) {
        super(realiseYear);
    }
    @Override
    public void turnOn() {
        System.out.println("macOs turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("macOs turned off");
    }

}
