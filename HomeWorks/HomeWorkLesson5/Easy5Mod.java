package HomeWorks.HomeWorkLesson5;

import java.util.Scanner;

public class Easy5Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ��: ");
        String name = scanner.nextLine();
        System.out.println("������� ��� �������: ");
        int age = scanner.nextInt();

        System.out.println();

        Person person = new Person();
        person.fullName = name;
        person.age = age;
        person.speak();
        person.talk();
        person.move();
    }
}
class PersonMod {
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