package HomeWorks.HomeWorkLesson13;

import java.util.Random;

public class Easy {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        ThreadMinImplementation threadMinImplementation = new ThreadMinImplementation(array);

        Thread threadMin = new Thread(threadMinImplementation);
        threadMin.start();

        try {
            threadMin.join();
            System.out.println("Максимальное значение массива: " + threadMinImplementation.getMaxNum());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


