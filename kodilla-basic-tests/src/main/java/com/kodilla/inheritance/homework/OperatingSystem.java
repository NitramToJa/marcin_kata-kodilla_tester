package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int realiseYear;

    public OperatingSystem(int realiseYear){
        this.realiseYear = realiseYear;
    }

    public void turnOn() {
        System.out.println("System turned on");
    }

    public void turnOff() {
        System.out.println("System turned off");
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void displayRealiseYear() {
        System.out.println("Year of realise: " + realiseYear);
    }
}
