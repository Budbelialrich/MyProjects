package JavaRushTasks;

/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
   индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.*/

import java.util.Arrays;
import java.util.Scanner;

public class Chiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];
        int[] ints = new int[10];

        System.out.println("Введите 10 строк: ");
        for(int i = 0; i < strings.length; i++){
            String input = scanner.nextLine();
            strings[i] = input;
            ints[i] = strings[i].length();
        }
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
