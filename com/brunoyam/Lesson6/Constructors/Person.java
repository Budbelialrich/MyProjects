package com.brunoyam.Lesson6.Constructors;

public class Person {
    private String name;
    private int age;

//    Person(){
//        System.out.println("Hello from constructor");
//    }

    Person(String name, int age){
        System.out.println("Hello from constructor with two parameters");

        this.name = name;
        this.age = age;
    }





    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }
}
