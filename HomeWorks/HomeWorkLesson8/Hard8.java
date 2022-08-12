package HomeWorks.HomeWorkLesson8;

import java.util.LinkedList;
import java.util.Scanner;

public class Hard8 {
    public static void main(String[] args) {

        int index = 0;

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("������� �������: set, get, replace, del, data ��� stop");
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.println("��������� ���������!");
                break;
            }

            switch (input) {
                case "set":
                    System.out.println("������� ��������: ");
                    int setValue = scanner.nextInt();
                    list.add(index, setValue);
                    System.out.println("�������� �������� � ������ ��� �������: " + index + "!");
                    index++;
                    break;

                case "get":
                    System.out.println("������� ����� ������: ");
                    int getValue = scanner.nextInt();
                    System.out.println("�������� �� ������: " + list.get(getValue));
                    break;

                case "del":
                    System.out.println("������� ����� ������: ");
                    int delIndex = scanner.nextInt();
                    list.remove(delIndex);
                    System.out.println("������ �������!");
                    break;

                case "data":
                    System.out.println(list);
                    break;

                case "replace":
                    System.out.println("������� ��������: ");
                    int newElement = scanner.nextInt();
                    System.out.println("������� ����� ������: ");
                    int newIndex = scanner.nextInt();
                    list.add(newIndex, newElement);
                    System.out.println("�������� " + newElement + " �������� � ������ ��� �������: " + newIndex + "!");
                    System.out.println("������� �������� ���������� ������!");
                    index++;
                    break;
            }
        }
    }
}

