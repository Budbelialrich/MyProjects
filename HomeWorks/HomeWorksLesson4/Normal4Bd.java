package HomeWorks.HomeWorksLesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Normal4Bd {
    public static void main (String [] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in );


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(81) + 20;
        }
        System.out.println("New massive: " + Arrays.toString(array));
        System.out.println("Vvedite chislo iz massiva");

        int index = -1;

        while (index == -1) {
            int inputNumber = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (inputNumber == array[i]) {
                    index = i;
                    System.out.println("Index vybrannogo chisla: " + index);
                }
            }
            if (index == -1) {
                System.out.println("Massiv ne soderzhit dannoe chislo, try again");
            }
        }
    }
}

