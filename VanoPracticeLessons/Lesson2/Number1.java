package VanoPracticeLessons.Lesson2;

//����������� ���������, ������� ��������� �� ���� ����� ������� � �������
//        ������ Scanner, �����, ��������������� ���������� ������ � ������. ���������
//        �������� �������� if, ���������� ������� � ������� ��������� � ���� ������ ����.
//        �������: ���� ������ 1-4 - ������������ ���, 5-8 - �������������� ���, 9 � �����
//        - ������������� ���. ��� ��, ���������� ������ ��� ����� ���� �������
//        ������������� ��������, � ����� ������ �������� ������� ������.

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        int input = scanner.nextInt();

        if(input == 1 || input == 2 || input == 3 || input == 4){
            System.out.print(input + " ������ - ����������� ���");
        } else if ( input == 5 || input == 6 || input == 7 || input == 8){
            System.out.print(input + " ������ - ������������� ���");
        } else if(input > 9){
            System.out.print(input + " ������ - ������������ ���");
        } else if (input < 1){
            System.out.print("�� ����� �������� ��������!");
        }
    }
}
