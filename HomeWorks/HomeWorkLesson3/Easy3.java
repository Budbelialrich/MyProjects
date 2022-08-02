package HomeWorks.HomeWorkLesson3;

//Вывести на экран последовательность чисел от 0 до n в обратном порядке

import java.util.Scanner;

public class Easy3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.print("Ваша обратная последовательность: ");
        for ( int i = n; n >= 0; n--){
            System.out.print(n + " ");
        }
    }
}
