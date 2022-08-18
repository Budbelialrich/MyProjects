package HomeWorks.HomeWorkLesson13.Easy;

import java.util.Arrays;
import java.util.Random;

public class Easy {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        ThreadMaxImplementation threadMaxImplementation = new ThreadMaxImplementation(array);

        Thread threadMax = new Thread(threadMaxImplementation);
        threadMax.start();

        try {
            threadMax.join();
            System.out.println("Максимальное значение массива: " + threadMaxImplementation.getMaxNum());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ThreadMinImplementation threadMinImplementation = new ThreadMinImplementation(array);

        Thread threadMin = new Thread(threadMinImplementation);
        threadMin.start();

        try {
            threadMin.join();
            System.out.println("Минимальное значение массива: " + threadMinImplementation.getMinNum());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


