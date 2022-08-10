package com.brunoyam.Lesson6.Constructors;

public class Main2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("DFHGBD", 15);
        person1.setFullName("Вася");
        person1.setAge(15);

        person1.move();
        person1.speak();

    }
}
