package MyProjects;

import java.util.Scanner;

public class TimeRefactoring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � �������: ");
        int input = scanner.nextInt();
        String NOM = "�����";
        String AM = "�";
        String UM = "�";
        String OM = "�";
        String YM = "�";

        double a  = input / 10.0;
        if (a == 0.1){
            System.out.println(input + " �����" + OM + " ����" + OM + ": 0 ����� � " + input + " " + NOM + UM);

        }
    }
}
