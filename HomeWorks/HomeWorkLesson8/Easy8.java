package HomeWorks.HomeWorkLesson8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//„то умеет эта программа:
//установка значенй в €чейку поочереди
//вывод значени€ выбранной €чейки
//очистка нужной €чейки
//получение информации о всем массиве

public class Easy8 {
    public static void main(String[] args) {

        int i = 0;

        List<Integer> arrayList = new ArrayList<>(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите команду: set, get, del, data или stop");
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stop"))
                break;

            switch (input) {
                case "set":
                    System.out.println("¬ведите значение: ");
                    int a = scanner.nextInt();
                    arrayList.add(i, a);
                    System.out.println("ячейка записана под номером: " + i + "!");
                    i++;
                    break;

                case "get":
                    System.out.println("¬ведите номер €чейки: ");
                    int c = scanner.nextInt();
                    System.out.println("«начение из €чейки: " + arrayList.get(c));
                    break;

                case "del":
                    System.out.println("¬ведите номер €чейки: ");
                    int z = scanner.nextInt();
                    arrayList.remove(z);
                    System.out.println("ячейка очищена!");
                    break;

                case "data":
                    System.out.println(arrayList);
                    break;
            }
        }
    }
}
