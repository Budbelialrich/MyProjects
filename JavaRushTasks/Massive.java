package JavaRushTasks;

//1. ������� ������ �� 20 �����.
//2. ������ � ���� �������� � ����������.
//3. ������� ��� ������� �� 10 ����� ������.
//4. ����������� ������� ������ � ��� ���������: �������� ����� � ������ ���������, ������ �������� �� ������ ���������.
//5. ������� ������ ��������� ������ �� �����, ������ �������� �������� � ����� ������.

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        int [] ints = new int[20];
        int [] ints1 = new int[10];
        int [] ints2 = new int[10];

        for(int i = 0; i < ints.length; i++){
            int input = scanner.nextInt();
            ints[i] = input;
            if(i < 10){
                ints1[a] = ints[i];
                a++;
        } else {
                ints2[b] = ints[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
    }
}
