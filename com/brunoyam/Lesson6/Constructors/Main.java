package com.brunoyam.Lesson6.Constructors;

public class Main {
    public static void main(String[] args) {
//челоовек должен иметь имя и возраст
        Person person = new Person("Вася", 35);

//        person.setName("Вася");
//        person.setAge(35);

        System.out.printf("Привет! Меня зовут %s, мне %d лет\n", person.getName(), person.getAge());


    }
}
