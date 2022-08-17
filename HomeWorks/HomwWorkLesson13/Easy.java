package HomeWorks.HomwWorkLesson13;


import java.util.Random;

public class Easy {
    public static void main(String[] args) {

        Random random = new Random();
        Thread threadMain = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("пусто ");
            }
        });

        Thread threadMin = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] array = new int[10];

                int a = 0;

                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(10);
                }
                int maxNum = array[0];
                for (int mass : array) {

                    if (mass > maxNum) {
                        maxNum = mass;
                    }
                }
                System.out.println("" + maxNum);
            }
        });

        try {
            threadMain.join();
            System.out.println("Максимальное значение массива: " + maxNum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}