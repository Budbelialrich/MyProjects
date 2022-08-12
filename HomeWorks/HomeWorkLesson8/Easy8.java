package HomeWorks.HomeWorkLesson8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��� ����� ��� ���������:
//��������� ������� � ������ ���������
//����� �������� ��������� ������
//������� ������ ������
//��������� ���������� � ���� �������

//�������������� - ��������� ��������� � ���������� �� ����� ����� ������!!!

public class Easy8 {
    public static void main(String[] args) {

        int index = 0;

        List<Integer> arrayList = new ArrayList<>(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �������: set, get, del, data ��� stop");
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stop")){
                System.out.println("��������� ���������!");
                break;}

            switch (input) {
                case "set":
                    System.out.println("������� ��������: ");
                    int setValue = scanner.nextInt();
                    arrayList.add(index, setValue);
                    System.out.println("�������� �������� � ������ ��� �������: " + index + "!");
                    index++;
                    break;

                case "get":
                    System.out.println("������� ����� ������: ");
                    int getValue = scanner.nextInt();
                    System.out.println("�������� �� ������: " + arrayList.get(getValue));
                    break;

                case "del":
                    System.out.println("������� ����� ������: ");
                    int delIndex = scanner.nextInt();
                    arrayList.remove(delIndex);
                    System.out.println("������ �������!");
                    break;

                case "data":
                    System.out.println(arrayList);
                    break;
            }
        }
    }
}
