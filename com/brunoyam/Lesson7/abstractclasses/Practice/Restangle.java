package com.brunoyam.Lesson7.abstractclasses.Practice;


public class Restangle extends Shape{

    int a;
    int b;

    @Override
    double area() {
        return (a*b);
    }

    Restangle(int a, int b){
        this.b = b;
        this.a = a;

    }
}
