package HomeWorks.HomeWorkLesson6.ClassWork;

public class Car {
    static int numberOfCars/* = 0*/;

    String color;

    Car(String color) {
        this.color = color;

        numberOfCars++;
    }
}
