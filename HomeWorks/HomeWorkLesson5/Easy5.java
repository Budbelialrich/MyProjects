package HomeWorks.HomeWorkLesson5;

public class Easy5 {
    public static void main(String[] args) {

        Person person = new Person();
        person.fullName = "Бударин игорь";
        person.age = 18;
        person.speak();
        person.talk();
        person.move();
    }
}
class Person {
    String fullName;
    int age;

    void speak() {
        System.out.println("Я " + fullName + ", мне " + age + " лет");
    }

    void talk() {
        System.out.println("Я умею говорить!");
    }

    void move() {
        System.out.println("А еще я умею ходить!");
    }
}