package com.brunoyam.Lesson7.abstractclasses.Practice;

public class Circle extends Shape{
    int radius;

    @Override
    double area() {
        return ((radius * radius)*Math.PI);
    }

    Circle(int radius){
        this.radius = radius;
    }
}
