package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows windows = new Windows(2015);
        windows.turnOn();
        windows.getRealiseYear();
        windows.displayRealiseYear();
        windows.turnOff();

        MacOs macOs = new MacOs(2019);
        macOs.turnOn();
        macOs.getRealiseYear();
        macOs.displayRealiseYear();
        macOs.turnOff();
    }
}
