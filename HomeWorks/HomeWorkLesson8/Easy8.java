package HomeWorks.HomeWorkLesson8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��� ����� ��� ���������:
//��������� ������� � ������ ���������
//����� �������� ��������� ������
//������� ������ ������
//��������� ���������� � ���� �������

public class Easy8 {
    public static void main(String[] args) {

        int i = 0;

        List<Integer> arrayList = new ArrayList<>(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �������: set, get, del, data ��� stop");
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stop"))
                break;

            switch (input) {
                case "set":
                    System.out.println("������� ��������: ");
                    int a = scanner.nextInt();
                    arrayList.add(i, a);
                    System.out.println("������ �������� ��� �������: " + i + "!");
                    i++;
                    break;

                case "get":
                    System.out.println("������� ����� ������: ");
                    int c = scanner.nextInt();
                    System.out.println("�������� �� ������: " + arrayList.get(c));
                    break;

                case "del":
                    System.out.println("������� ����� ������: ");
                    int z = scanner.nextInt();
                    arrayList.remove(z);
                    System.out.println("������ �������!");
                    break;

                case "data":
                    System.out.println(arrayList);
                    break;
            }
        }
    }
}
