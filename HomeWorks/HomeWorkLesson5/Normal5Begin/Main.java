package HomeWorks.HomeWorkLesson5.Normal5Begin;

//������� ����� Car, Engine � Driver.
//����� Driver �������� ���� - ���, ���� ��������.
//����� Engine �������� ���� - ��������, �������������.
//����� Car �������� ���� -
// ����� ����������, ����� ����������, ���, �������� ���� Driver, ����� ���� Engine.
//������ start(), stop(), turnRight(), turnLeft(), ������� ������� �� ������:
//"�������", "���������������", "������� �������" ��� "������� ������".
//� ����� ����� toString(), ������� ������� ������ ���������� �� ����������, �� �������� � ������.

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarInf("Baic", "Sport Car", 1600);

        Driver driver = new Driver();
        driver.setFioAndExp("��������� ������� ����������", 20);

        Engine engine = new Engine();
        engine.setEngineInf("Baic Motors", 750);

        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        
    }
}



