package VanoPracticeLessons.Lesson2;

//���� ��� �����, ������� �������� ������������� ����� ������� (������� ��� ���
//        ����� a � b). ��������� ���� for, ������� ��� ����� �� ��������� ����� a � b,
//        ������� ������� �� 5 ��� �������, �� ��� ���� �� ������� �� 10 ��� �������.
//        ��������, ����� 15 �������� ��� ���� ������� (������� �� 5 ��� ������� � ��
//        ������� �� 10 ��� �������), �� ����� 20 �� �������� ��� ���� ������� (������� �� 5
//        ��� ������� � ������� �� 10 ��� �������). ���� ����� a � b � ��������� �� ���������.
//        ���� a >= b ������� ��������� "������������ ����".
//        ������:
//        ������ � �������: 7 78
//        �����: 15 25 35 45 55 65 75


import java.util.Scanner;

public class Number2For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int number1 = scanner.nextInt();
        System.out.println("������� ������ �����: ");
        int number2 = scanner.nextInt();
        System.out.println("�����: ");
        for (int i = number1; i <= number2; i++){
            if(i % 5 == 0 & i % 10 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
