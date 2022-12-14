package VanoPracticeLessons.Lesson3;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город: ");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Stop"))
                break;

            switch (input) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;

                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Нет такого города!");
            }
        }
    }
}
