package HomeWorks.HomeWorkLesson5.Normal5Begin;

//Создать класс Car, Engine и Driver.
//Класс Driver содержит поля - ФИО, стаж вождения.
//Класс Engine содержит поля - мощность, производитель.
//Класс Car содержит поля -
// марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
//Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
//"Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
//А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarInf("Baic", "Sport Car", 1600);

        Driver driver = new Driver();
        driver.setFioAndExp("Николавев Николай Николаевич", 20);

        Engine engine = new Engine();
        engine.setEngineInf("Baic Motors", 750);

        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        
    }
}



