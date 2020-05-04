package com.company;

public class Car {
    //Initialization block
    {
        color = "Red";
    }
    //static initialization block
    static {
        //color = "Yellow"; // Illegal as non-static variable
        //printDescription(); // Illegal as non-static method
        setCarCount(3);
    }
    String color;
    String type;
    int serialNumber;
    //Static Variable declaration
    static int carCount;

    // Constructors
    // User defined default constructor
    // Compiler will not create a default constructor in this case
    Car() {
        carCount++; // Static variable increment
        serialNumber = carCount;
        color = "Blue";
    }

    // User defined constructor
    Car(String color, String type){
        this();
        this.color = color;
        this.type = type;
    }

    void printDescription()
    {
        System.out.println("This is a " + this.color + " " + this.type);
    }

    String getDescription()
    {
        String desc = "This is a " + color + " " + type;
        return  desc;
    }
    void customize(String color, String type)
    {
        this.color = color;
        this.type = type + " " + type;
        System.out.println(getDescription());
    }

    // Static Methods
    static void setCarCount(int c)
    {
        carCount = c;
    }
    static void resetCarCount()
    {
        carCount = 0;
    }
}
