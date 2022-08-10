package com.brunoyam.Lesson7.abstractclasses.Practice;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(13);
        Shape restangle = new Restangle(12,12);

        Shape[] shape = {circle, restangle};

        for (Shape shapes: shape
             ) {
            System.out.println(shapes.area() );
        }

    }
}
