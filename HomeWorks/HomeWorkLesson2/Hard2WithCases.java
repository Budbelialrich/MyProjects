package HomeWorks;

import java.util.Scanner;

public class Hard2WithCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��� ��� �����: �����, �������, � ����� � ��������� ����� �������?");
        String input = scanner.nextLine();
        switch (input){
            case "����������":
                System.out.println("���������!");
                break;
            default:
                System.out.println("�� ���������!");
        }

    }
}
