package HomeWorks.HomeWorksLesson4;

//Создайте массив из 12 случайных целых чисел из отрезка [0;30].
//Опеделите какой элемент является в этом массиве максимальным и выведите в консоль его индекс.

import java.util.Random;

public class EasyNotEasy4 {
    public static void main(String[] args) {

        int numbers[] = new int[12]; // создаем масиив на 12 ячеек

        System.out.print("Массив: ");

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random(); // задаем случайные значения для массива
            numbers[i] = random.nextInt(30); // заполняем 12 ячеек случайными значениями до 30
            System.out.print(numbers[i] + " "); // выводим каждое значение по отдельности без окончания цикла for
        }
        int max = numbers[0], index = 0; // присваиваем переменой индекс 0 и значение переменной под тем же индексом
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
                index = i;
            }

        }
        System.out.println();
        System.out.println("Максимальное число: " + max);
        System.out.println("Индекс максимального числа: " + index);
    }
}
