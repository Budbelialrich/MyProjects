package VanoPracticeLessons.Lesson3;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Stop"))
                break;

            switch (input) {
                case "������":
                case "�����������":
                case "������":
                    System.out.println("������");
                    break;

                case "���":
                case "�����":
                case "�����":
                    System.out.println("������");
                    break;

                case "���������":
                case "���������":
                case "������":
                    System.out.println("������");
                    break;

                case "������":
                case "������":
                case "�����":
                    System.out.println("��������");
                    break;

                default:
                    System.out.println("��� ������ ������!");
            }
        }
    }
}
