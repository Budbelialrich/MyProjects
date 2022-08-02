package HomeWorks;

import java.util.Objects;
import java.util.Scanner;

public class Hard2WithoutSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String input = scanner.nextLine();
        String answer = "Троллейбус";
        if (Objects.equals(input, answer)){ //Спросить на уроке про этот момент
            System.out.println("Правильно!");
        } else {
            System.out.println("Не правильно!");
        }
    }
}
