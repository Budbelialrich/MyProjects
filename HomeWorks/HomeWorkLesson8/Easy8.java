package HomeWorks.HomeWorkLesson8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//„то умеет эта программа:
//установка значенй в €чейку поочереди
//вывод значени€ выбранной €чейки
//очистка нужной €чейки
//получение информации о всем массиве

//ѕредупреждени€ - программа находитс€ в разработке на этапе јльфа версии!!!

public class Easy8 {
    public static void main(String[] args) {

        int index = 0;

        List<Integer> arrayList = new ArrayList<>(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите команду: set, get, del, data или stop");
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stop")){
                System.out.println("ѕрограмма завершена!");
                break;}

            switch (input) {
                case "set":
                    System.out.println("¬ведите значение: ");
                    int setValue = scanner.nextInt();
                    arrayList.add(index, setValue);
                    System.out.println("«начение записано в €чейку под номером: " + index + "!");
                    index++;
                    break;

                case "get":
                    System.out.println("¬ведите номер €чейки: ");
                    int getValue = scanner.nextInt();
                    System.out.println("«начение из €чейки: " + arrayList.get(getValue));
                    break;

                case "del":
                    System.out.println("¬ведите номер €чейки: ");
                    int delIndex = scanner.nextInt();
                    arrayList.remove(delIndex);
                    System.out.println("ячейка очищена!");
                    break;

                case "data":
                    System.out.println(arrayList);
                    break;
            }
        }
    }
}
