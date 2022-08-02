package MyProjects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeReafactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � �������: ");
        int input = scanner.nextInt();

        String OneMinutes = "������";
        String TwoToFourMinutes = "������";
        if (input < 60 && input != 1) {
            System.out.println(input + " ����� �����: 0 ����� � " + input + " �����");
        } else if (input > 60) {
            int hour = input / 60;
            int min = input % 60;
            System.out.println(input + " ����� �����: " + hour + " ����� � " + min + " �����");
        } else if (input == 1){
            System.out.println(input + " ������ �����: 0 ����� � " + input + " " + OneMinutes);
        } else if (input == 2){
            System.out.println(input + " ������ �����: 0 ����� � " + input + " " + TwoToFourMinutes);
        }

    }
}
