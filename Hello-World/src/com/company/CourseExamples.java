package com.company;

public class CourseExamples {
    static Car myCar;

    static void doSomething(Car car){
        myCar = car;
        System.out.println("The color of the car is: " + myCar.color);
        myCar = null; // de-references the object to prevent memory leak
    }
}
