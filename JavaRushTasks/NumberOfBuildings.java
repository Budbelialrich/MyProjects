package JavaRushTasks;

//1. Создать массив на 15 целых чисел.
//2. Ввести в него значения с клавиатуры.
//3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
//Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой.
// Выяснить, на какой стороне улицы проживает больше жителей.
//4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
// или "В домах с четными номерами проживает больше жителей."

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberOfBuildings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int [] ints = new int[random.nextInt(0,15)];
        ArrayList<Integer> leftSide = new ArrayList<>(10);
        ArrayList<Integer> rightSide = new ArrayList<>(10);

        int sumRight = 0;
        int sumLeft = 0;

        for(int i = 0; i < ints.length; i++){
            ints[i] = random.nextInt(10);

            if(i % 2 != 0){
                leftSide.add(ints[i]);
                sumLeft = sumLeft + ints[i];
            } else {
                rightSide.add(ints[i]);
                sumRight = sumRight + ints[i];
            }
        }

        System.out.println("Количество домов по левой стороне: "  + leftSide.size());
        System.out.println("Количество домов по правой стороне: "  + rightSide.size());

        System.out.println("Количество жителей по левой стороне: "  + sumLeft);
        System.out.println("Количество жителей по правой стороне: "  + sumRight);

        if (sumRight > sumLeft){
            System.out.println("В домах с нечетными номерами (по првой стороне) проживает больше жителей");
        } else {
            System.out.println("В домах с четными номерами (по левой стороне) проживает больше жителей");
        }
    }
}
