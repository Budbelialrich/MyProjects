package HomeWorks.HomeWorkLesson5.Normal5Begin;

public class Car {

    String stamp;
    String type;
    int weight;


    Engine engine = new Engine();
    Driver driver = new Driver();


    void start() {
        engine.start();
        System.out.println("�������");
    }

    void stop() {
        engine.stop();
    }

    void turnLeft() {
        System.out.println("������������ �� ����");
    }

    void turnRight() {
        System.out.println("������������ �� �����");
    }

    void setCarInf(String stamp, String type, int weight) {
        this.stamp = stamp;
        this.type = type;
        this.weight = weight;
    }

    String getStamp() {
        return stamp;
    }

    String getType() {
        return type;
    }

    int getWeight() {
        return weight;
    }
    void allInformation(){
        System.out.println();
    }


}
