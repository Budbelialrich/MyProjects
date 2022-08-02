package HomeWorks;

import java.util.Scanner;

//Передать на вход программы число от 1 до 7 в качестве аргумента.
//Если число равно 1, выводим на консоль “Понедельник”,
//2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
//Используем конструкцию if-else-if.

public class Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 от 7: ");
        int a = scanner.nextInt();
        if (a < 1 || a > 7) {
            System.out.println("Вы ввели неверное значение");
        } else if (a == 1) {
            System.out.println("Понедельник");
        } else if (a == 2) {
            System.out.println("Вторник");
        } else if (a == 3) {
            System.out.println("Среда");
        } else if (a == 4) {
            System.out.println("Четверг");
        } else if (a == 5) {
            System.out.println("Пятница");
        } else if (a == 6) {
            System.out.println("Суббота, выходной!");
        } else if (a == 7) {
            System.out.println("Воскресенье, выходной!");
        }
    }
}
