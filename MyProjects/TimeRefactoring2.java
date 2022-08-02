package MyProjects;

import java.util.Scanner;

public class TimeRefactoring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вреям в минутах: ");
        int input = scanner.nextInt();
        String NOM = "минут";
        String AM = "ы";
        String UM = "у";
        String OM = "а";
        String YM = "о";

        double a  = input / 10.0;
        if (a == 0.1){
            System.out.println(input + " минут" + OM + " равн" + OM + ": 0 часов и " + input + " " + NOM + UM);

        }
    }
}
