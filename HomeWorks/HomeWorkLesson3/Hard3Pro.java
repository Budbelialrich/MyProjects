package HomeWorks.HomeWorkLesson3;

import java.util.Scanner;

public class Hard3Pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите значение: ");
        int input = scanner.nextInt();
        int [] massive = new int [input];
        massive [0]  = 0;
        massive [1] = 1;
        for (int i = 2; i < input; ++i){
            massive [i]= massive [i - 1] + massive [i -2];
        }
        for (int i = 0; i < input; ++i ){
            System.out.print(massive[i] + " ");

        }
    }

}
