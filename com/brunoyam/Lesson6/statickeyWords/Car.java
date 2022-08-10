package com.brunoyam.Lesson6.statickeyWords;

public class Car {

    static int numbersOfCars;
    private String color;

    Car(String color){
        this.color = color;

        numbersOfCars++;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
