package MyProjects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeReafactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время в минутах: ");
        int input = scanner.nextInt();

        String OneMinutes = "минуты";
        String TwoToFourMinutes = "минуты";
        if (input < 60 && input != 1) {
            System.out.println(input + " минут равно: 0 часов и " + input + " минут");
        } else if (input > 60) {
            int hour = input / 60;
            int min = input % 60;
            System.out.println(input + " минут равно: " + hour + " часов и " + min + " минут");
        } else if (input == 1){
            System.out.println(input + " минута равна: 0 часов и " + input + " " + OneMinutes);
        } else if (input == 2){
            System.out.println(input + " минуты равны: 0 часов и " + input + " " + TwoToFourMinutes);
        }

    }
}
