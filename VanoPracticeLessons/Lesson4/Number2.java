package VanoPracticeLessons.Lesson4;


import java.util.Arrays;
import java.util.Random;

public class Number2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];
        int a = 0;
        int b = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);

            for (int mass : array) {
                if (array[i] > a) {
                    a = array[i];
                }
                if (array[i] < a){
                    b = array[i];
                }
            }
        }
        System.out.println("Наибольшее число: " + a);
        System.out.println("Наименьшее число: " + b);
        System.out.println(Arrays.toString(array));
    }
}
