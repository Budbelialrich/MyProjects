package HomeWorks;

import java.util.Scanner;

public class Hard2WithCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String input = scanner.nextLine();
        switch (input){
            case "Троллейбус":
                System.out.println("Правильно!");
                break;
            default:
                System.out.println("Не правильно!");
        }

    }
}
