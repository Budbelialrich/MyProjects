package VanoPracticeLessons.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sum = 0;
        int overEight = 0;
        int equalToOne = 0;
        int withoutATrace = 0;
        int withATrace = 0;

        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum = sum + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Размер массива: " + array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                overEight++;
            }

            if (array[i] == 1) {
                equalToOne++;
            }

            if (array[i] % 2 == 0) {
                withoutATrace++;
            }

            if (array[i] % 2 != 0) {
                withATrace++;
            }
        }
        System.out.println("Количество чисел больше 8: " + overEight);
        System.out.println("Количество чисел равных 1: " + equalToOne);
        System.out.println("Количество четных чисел: " + withoutATrace);
        System.out.println("Количество нечетных чисел: " + withATrace);
        System.out.println("Сумма чисел массива: " + sum);
    }
}
