package HomeWorks.HomeWorkLesson3;

import java.util.Scanner;

//Здесь работает не с нуля, но работет))

public class Hard3NoMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int input = scanner.nextInt();
        System.out.println("Последовательность Фибоначчи до " + input + " значения: ");
        long fib1 = 0;
        long fib2 = 1;
        long fib3;
        for (long i = 1; i < input; ++i){
            fib3 = fib1 + fib2;
        }

        }
    }

