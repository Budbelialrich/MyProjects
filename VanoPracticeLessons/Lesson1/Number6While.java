package VanoPracticeLessons.Lesson1;

// ќбъ€вите переменную типа int, им€ переменной - k. ѕрисвойте этой переменной
//         какую-нибудь цифру от 1 до 9. »спользу€ цикл на ваше усмотрение (for или while),
//         выведите в консоль таблицу умножени€ дл€ этой цифры в следующем формате:
//         1 x k = Е
//         2 x k = Е
//         3 x k = Е
//         ЕЕ
//         9 x k = Е
//         ѕример:
//         k = 3
//         ¬ывод в консоль:
//         1 x 3 = 3
//         2 x 3 = 6
//         3 x 3 = 9
//         ЕЕ
//         9 x 3 = 27

import java.util.Scanner;

public class Number6While {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите числот от 1 до 9: ");
        int input = scanner.nextInt();
        while(i != 10){
            System.out.println(i * input);
            i++;
        }

    }
}
