package VanoPracticeLessons.Lesson1;

// �������� ���������� ���� int, ��� ���������� - k. ��������� ���� ����������
//         �����-������ ����� �� 1 �� 9. ��������� ���� �� ���� ���������� (for ��� while),
//         �������� � ������� ������� ��������� ��� ���� ����� � ��������� �������:
//         1 x k = �
//         2 x k = �
//         3 x k = �
//         ��
//         9 x k = �
//         ������:
//         k = 3
//         ����� � �������:
//         1 x 3 = 3
//         2 x 3 = 6
//         3 x 3 = 9
//         ��
//         9 x 3 = 27

import java.util.Scanner;

public class Number6While {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �� 1 �� 9: ");
        int input = scanner.nextInt();
        while(i != 10){
            System.out.println(i * input);
            i++;
        }

    }
}
