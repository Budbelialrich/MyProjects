package JavaRushTasks;

//1. —оздать массив на 20 чисел.
//2. ¬вести в него значени€ с клавиатуры.
//3. —оздать два массива на 10 чисел каждый.
//4. —копировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. ¬ывести второй маленький массив на экран, каждое значение выводить с новой строки.

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        int [] ints = new int[20];
        int [] ints1 = new int[10];
        int [] ints2 = new int[10];

        for(int i = 0; i < ints.length; i++){
            int input = scanner.nextInt();
            ints[i] = input;
            if(i < 10){
                ints1[a] = ints[i];
                a++;
        } else {
                ints2[b] = ints[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
    }
}
