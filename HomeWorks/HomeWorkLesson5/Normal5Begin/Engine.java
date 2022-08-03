package HomeWorks.HomeWorkLesson5.Normal5Begin;

public class Engine {

    String man;
    int pow;

    void start() {
        System.out.println("Заводим двигатель");
    }

    void stop() {
        System.out.println("Останавливаемся");
    }

    String getMan() {
        return man;
    }

    int getPow() {
        return pow;
    }

    public void setEngineInf(String man, int pow) {
        this.man = man;
        this.pow = pow;
    }


}
