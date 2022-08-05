package HomeWorks.HomeWorkLesson4;

//�������� ������ �� 10 ��������� ����� ����� �� ������� [20;100].
//�������� � ������� ���������� �������, ����� ����������� ���� � ���������� ����� �� ����� �������.
//�������� � ������� ������ ��������, ������� ���� ������������, � �������.
//���� ������������ ���� �����, �������� ���� � �������, �� �������� ������.

import java.util.Random;
import java.util.Scanner;

public class Normal4 {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        System.out.print("������: ");

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(20, 100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("������� ����� �� �������: ");
        Scanner scanner = new Scanner(System.in);

        int index = -1;

        while (index == -1) {
            int input = scanner.nextInt();
            for (int i = 0; i < numbers.length; i++) {
                if (input == numbers[i]) {
                    index = i;
                    System.out.println("������ ���������� �����: " + index);
                }
            }
            if (index == -1) {
                System.out.println("�� ����� �������� ��������!");
            }
        }
    }
}
