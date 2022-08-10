package com.brunoyam.Lesson7.abstractclasses;

public class Main {
    public static void main(String[] args) {


//        Animal animal = new Animal();
//        animal.weight = 2.5;
//        animal.say();

        Animal animal1 = new Dog();
        animal1.weight = 3.4;
        animal1.say();

        Animal animal2 = new Cat();
        animal2.weight = 3.1;
        animal2.say();

        Animal animal3 = new Duck();
        animal3.weight = 2.6;
        animal3.say();
    }
}
