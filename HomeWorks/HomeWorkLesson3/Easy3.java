package HomeWorks.HomeWorkLesson3;

//������� �� ����� ������������������ ����� �� 0 �� n � �������� �������

import java.util.Scanner;

public class Easy3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        int n = scanner.nextInt();
        System.out.print("���� �������� ������������������: ");
        for ( int i = n; n >= 0; n--){
            System.out.print(n + " ");
        }
    }
}
