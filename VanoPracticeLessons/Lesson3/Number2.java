package VanoPracticeLessons.Lesson3;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите делимое: ");
            double divisible = scanner.nextDouble();
            System.out.println("Введите делитель: ");
            double divider = scanner.nextDouble();


            if(divider == 0){
                break;
            }

            double answer = divisible / divider;
            System.out.println("Вывод: " + answer);
            System.out.println();


        }
    }
}
