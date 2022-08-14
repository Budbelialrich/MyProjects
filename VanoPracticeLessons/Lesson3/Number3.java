package VanoPracticeLessons.Lesson3;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (i < 5) {
            i++;
            System.out.println("Введите делимое: ");
            double divisible = scanner.nextDouble();
            System.out.println("Введите делитель: ");
            double divider = scanner.nextDouble();


            if (divider == 0) {
                System.out.println("Деление на ноль!");
                System.out.println();
                continue;
            }

            double answer = divisible / divider;
            System.out.println("Вывод: " + answer);
            System.out.println();


        }
    }
}


