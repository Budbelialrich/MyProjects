package YouTubeLessons;

import java.util.ArrayList;

public class ArrayListDinamicArray {
    public static void main(String[] args) {
         ArrayList<Integer> arrayList = new ArrayList<>();

         for(int i = 0; i < 10; i++) {
             arrayList.add(i);
         }

//        System.out.println(arrayList); // вызывает метод toString - выводит все содержимое
//
//        System.out.println(arrayList.get(0)); // вывводят элемент по индексу
//        System.out.println(arrayList.get(99));
//
//        System.out.println(arrayList.size()); // выводит размер

//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.print(arrayList.get(i) + " "); // вывод с помощью цикла
//
//        }
//        System.out.println();
//
//        for (Integer x : arrayList) // вывод с помощью forEach
//            System.out.print(x + " ");

        arrayList.remove(5);
        System.out.println(arrayList);
    }
}
