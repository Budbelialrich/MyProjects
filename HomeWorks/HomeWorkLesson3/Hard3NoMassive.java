package HomeWorks.HomeWorkLesson3;

import java.util.Scanner;

//����� �������� �� � ����, �� �������))

public class Hard3NoMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��������: ");
        int input = scanner.nextInt();
        System.out.println("������������������ ��������� �� " + input + " ��������: ");
        long fib1 = 0;
        long fib2 = 1;
        long fib3;
        for (long i = 1; i < input; ++i){
            fib3 = fib1 + fib2;
        }

        }
    }

