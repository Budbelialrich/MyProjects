package HomeWorks.HomeWorkLesson5;

public class Easy5 {
    public static void main(String[] args) {

        Person person = new Person();
        person.fullName = "������� �����";
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
        System.out.println("� " + fullName + ", ��� " + age + " ���");
    }

    void talk() {
        System.out.println("� ���� ��������!");
    }

    void move() {
        System.out.println("� ��� � ���� ������!");
    }
}