package HomeWorks.HomeWorksLesson4;

//�������� ������ �� 12 ��������� ����� ����� �� ������� [0;30].
//��������� ����� ������� �������� � ���� ������� ������������ � �������� � ������� ��� ������.

import java.util.Random;

public class EasyNotEasy4 {
    public static void main(String[] args) {

        int numbers[] = new int[12]; // ������� ������ �� 12 �����

        System.out.print("������: ");

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random(); // ������ ��������� �������� ��� �������
            numbers[i] = random.nextInt(30); // ��������� 12 ����� ���������� ���������� �� 30
            System.out.print(numbers[i] + " "); // ������� ������ �������� �� ����������� ��� ��������� ����� for
        }
        int max = numbers[0], index = 0; // ����������� ��������� ������ 0 � �������� ���������� ��� ��� �� ��������
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
                index = i;
            }

        }
        System.out.println();
        System.out.println("������������ �����: " + max);
        System.out.println("������ ������������� �����: " + index);
    }
}
