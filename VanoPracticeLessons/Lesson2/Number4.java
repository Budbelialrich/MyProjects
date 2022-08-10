package VanoPracticeLessons.Lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y = 0;
        System.out.println("¬ведите значение: ");
        double x = scanner.nextDouble();
        if (x >= 5) {
             y = ((x * x) - 10.0) / (100.0 + 7.0);
        } else if (x > -3 && x < 5) {
             y = (x + 3) * (x * x - 2);
        } else {
           y = 420;
        }
        System.out.println("Y равен: " + y);
    }
}
