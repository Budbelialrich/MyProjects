package VanoPracticeLessons.Lesson2;

//–еализовать программу, котора€ принимает на вход через консоль с помощью
//        класса Scanner, число, соответствующее количеству этажей в здании. »спользу€
//        условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
//        ”слови€: если этажей 1-4 - Ућалоэтажный домФ, 5-8 - У—реднеэтажный домФ, 9 и более
//        - Ућногоэтажный домФ. “ак же, необходимо учесть что может быть введено
//        отрицательное значение, в таком случае сообщить Уќшибка вводаФ.

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число: ");
        int input = scanner.nextInt();

        if(input == 1 || input == 2 || input == 3 || input == 4){
            System.out.print(input + " этажей - малоэтажный дом");
        } else if ( input == 5 || input == 6 || input == 7 || input == 8){
            System.out.print(input + " этажей - среднеэтажный дом");
        } else if(input > 9){
            System.out.print(input + " этажей - многоэтажный дом");
        } else if (input < 1){
            System.out.print("¬ы ввели неверное значение!");
        }
    }
}
