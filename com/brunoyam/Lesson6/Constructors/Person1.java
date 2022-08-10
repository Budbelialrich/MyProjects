package com.brunoyam.Lesson6.Constructors;

public class Person1 {

    String fullName;
    int age;

    Person1(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person1(){
    }

    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    String getFullName() {
        return fullName;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void move() {
        System.out.println(getFullName() + " идет");
    }

    void speak() {
        System.out.println("≈му " + getAge() + " лет");
    }

}
