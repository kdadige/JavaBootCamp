package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World!");
        //Car c = new Car();
        // Static variable access
        // Note: Used name of the class to access as it is a static variable
        //Car.carCount = 1; // Correct way of accessing static variable
        // Below is not a preferred(although its legal) way of accessing a static variable,
        // as it is not tied to an object.
        //c.carCount = 2;

        Car c1, c2, c3;
        c1 = new Car("Red", "Sedan");
        c2 = new Car("Green", "Coupe");
        c3 = new Car("Blue", "SUV");

        System.out.println("Car1 SerialNumber: " + c1.serialNumber);
        System.out.println("Car2 SerialNumber: " + c2.serialNumber);
        System.out.println("Car3 SerialNumber: " + c3.serialNumber);
        System.out.println("Static variable print: " + Car.carCount);

        Car.resetCarCount();

        System.out.println("Car1 SerialNumber: " + c1.serialNumber);
        System.out.println("Car2 SerialNumber: " + c2.serialNumber);
        System.out.println("Car3 SerialNumber: " + c3.serialNumber);
        System.out.println("Static variable print: " + Car.carCount);

        //System.out.println(c.color);
    }
}