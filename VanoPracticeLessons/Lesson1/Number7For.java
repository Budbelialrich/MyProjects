package VanoPracticeLessons.Lesson1;

import java.util.Scanner;

public class Number7For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число от 1 до 9: ");
        int input = scanner.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.println(i * input);
        }
    }
}
