package HomeWorks;

import java.util.Scanner;

public class Normal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int input = scanner.nextInt();
        String b = "Понедельник";
        switch (input) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота, выходной!");
                break;
            case 7:
                System.out.println("Воскресенье, выходной!");
                break;
            default:
                System.out.println("Вы ввели неверное значение");
        }


    }
}
