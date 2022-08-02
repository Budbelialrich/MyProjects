package HomeWorks.HomeWorkLesson3;

import java.util.Scanner;

public class Hard3OnLesson {
    public static void main(String[] args) {
        System.out.println("Программа которая выводит последоовательность Фибоначчи до F(n) включительно");
        System.out.println("Введите n: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print( "Последовательность Фмибоначчи: до F(" + n + "): ");

        int fi0 = 0;
        int fi1 = 1;
        if (n >= 2) {
            int [] numbers = new int [n + 1];

            numbers [0] = fi0;
            numbers [1] = fi1;

            System.out.print(numbers [0] + " " + numbers[1] + " ");

            for ( int i = 2; i <= n; i++){
                numbers [i] = numbers [i - 1] + numbers [i - 2];
                System.out.print(numbers [i] + " ");
            }
        } else if (n == 1) {
            System.out.println(fi0 + " " + fi1 );
        } else if (n == 0){
            System.out.println(fi0);
        } else{
            System.out.println("Вы ввели отрицательноое число!");
        }


    }
}
