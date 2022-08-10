package com.brunoyam.Lesson6.statickeyWords;

import static java.lang.Math.*;
//import static java.lang.Math.sin;

public class Main {
    int noStaticVariable;
    static int staticVariable;

    public static void main(String[] args) {
        System.out.println("Number of cars: " + Car.numbersOfCars);

        Car orangeCar = new Car("Orange");
        System.out.println("Number of cars: " + orangeCar.numbersOfCars);

        Car blueCar = new Car("Blue");
        System.out.println("Number of cars: " + blueCar.numbersOfCars);

//        MathUtil mathutil = new MathUtil();
        int result = MathUtil.sum(2, 3);
        System.out.println("Result: " + result);

//        System.out.println(noStaticVariable);
        System.out.println(staticVariable);


        //статический импорт
        System.out.println("PI: " + PI);
        System.out.println("Синус тридцати градусоов " + sin(PI / 6));

    }

    static void test (){
        System.out.println(staticVariable);
    }
}
