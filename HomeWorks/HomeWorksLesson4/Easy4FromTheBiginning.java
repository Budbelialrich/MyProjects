package HomeWorks.HomeWorksLesson4;

import java.util.Random;

public class Easy4FromTheBiginning {
    public static void main(String[] args) {
        int[] numbers = new int[12];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(30);

        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int min = 1;

        for (int number : numbers) {
            if (number > min) {
                min = number;
            }
        }
        System.out.println("Максимальное число: " + min);
    }
}




