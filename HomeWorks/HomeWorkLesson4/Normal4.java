package HomeWorks.HomeWorkLesson4;

//Создайте массив из 10 случайных целых чисел из отрезка [20;100].
//Выведите в консоль содержимое массива, чтобы пользовател ввел с клавиатуры число из этого массива.
//Выведите в консоль индекс элемента, который ввел пользователь, в массиве.
//Если пользователь ввел число, которого нету в массиве, то выведите ошибку.

import java.util.Random;
import java.util.Scanner;

public class Normal4 {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        System.out.print("Массив: ");

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(20, 100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Введите число из массива: ");
        Scanner scanner = new Scanner(System.in);

        int index = -1;

        while (index == -1) {
            int input = scanner.nextInt();
            for (int i = 0; i < numbers.length; i++) {
                if (input == numbers[i]) {
                    index = i;
                    System.out.println("Индекс выбранного числа: " + index);
                }
            }
            if (index == -1) {
                System.out.println("Вы ввели неверное значение!");
            }
        }
    }
}
