package HomeWorks.HomeWorkLesson3;

//������� ������������������ ��������� �� n

import java.util.Scanner;

public class Hard3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��������: ");
        int input = scanner.nextInt();
        System.out.println("������������������ ��������� �� " + input + " ��������: ");
        int[] array = new int[input];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}


