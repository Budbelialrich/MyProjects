package HomeWorks;

import java.util.Scanner;

//�������� �� ���� ��������� ����� �� 1 �� 7 � �������� ���������.
//���� ����� ����� 1, ������� �� ������� ������������,
//2 ��������� � ��� �����. ���� 6 ��� 7 � ���������.
//���������� ����������� if-else-if.

public class Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� 1 �� 7: ");
        int a = scanner.nextInt();
        if (a < 1 || a > 7) {
            System.out.println("�� ����� �������� ��������");
        } else if (a == 1) {
            System.out.println("�����������");
        } else if (a == 2) {
            System.out.println("�������");
        } else if (a == 3) {
            System.out.println("�����");
        } else if (a == 4) {
            System.out.println("�������");
        } else if (a == 5) {
            System.out.println("�������");
        } else if (a == 6) {
            System.out.println("�������, ��������!");
        } else if (a == 7) {
            System.out.println("�����������, ��������!");
        }
    }
}
