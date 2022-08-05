package HomeWorks.HomeWorkLesson6.ClassWork;


public class Main {

    public static void main(String[] args) {
        System.out.println("Number of cars: " + Car.numberOfCars);

        Car orangeCar = new Car("Orange");
        System.out.println("Number of cars: " + orangeCar.numberOfCars);

        Car blueCar = new Car("Blue");
        System.out.println("Number of cars: " + blueCar.numberOfCars);
    }
}
