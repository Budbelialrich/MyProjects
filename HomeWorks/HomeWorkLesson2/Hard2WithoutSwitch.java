package HomeWorks;

import java.util.Objects;
import java.util.Scanner;

public class Hard2WithoutSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("��� ��� �����: �����, �������, � ����� � ��������� ����� �������?");
        String input = scanner.nextLine();
        String answer = "����������";
        if (Objects.equals(input, answer)){ //�������� �� ����� ��� ���� ������
            System.out.println("���������!");
        } else {
            System.out.println("�� ���������!");
        }
    }
}
