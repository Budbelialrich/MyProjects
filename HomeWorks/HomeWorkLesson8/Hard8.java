package HomeWorks.HomeWorkLesson8;

import java.util.LinkedList;
import java.util.Scanner;

public class Hard8 {
    public static void main(String[] args) {

        int index = 0;

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("¬ведите команду: set, get, replace, del, data или stop");
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.println("ѕрограмма завершена!");
                break;
            }

            switch (input) {
                case "set":
                    System.out.println("¬ведите значение: ");
                    int setValue = scanner.nextInt();
                    list.add(index, setValue);
                    System.out.println("«начение записано в €чейку под номером: " + index + "!");
                    index++;
                    break;

                case "get":
                    System.out.println("¬ведите номер €чейки: ");
                    int getValue = scanner.nextInt();
                    System.out.println("«начение из €чейки: " + list.get(getValue));
                    break;

                case "del":
                    System.out.println("¬ведите номер €чейки: ");
                    int delIndex = scanner.nextInt();
                    list.remove(delIndex);
                    System.out.println("ячейка очищена!");
                    break;

                case "data":
                    System.out.println(list);
                    break;

                case "replace":
                    System.out.println("¬ведите значение: ");
                    int newElement = scanner.nextInt();
                    System.out.println("¬ведите номер €чейки: ");
                    int newIndex = scanner.nextInt();
                    list.add(newIndex, newElement);
                    System.out.println("«начение " + newElement + " записано в €чейку под номером: " + newIndex + "!");
                    System.out.println("ѕрошлое значение сместилось правее!");
                    index++;
                    break;
            }
        }
    }
}

