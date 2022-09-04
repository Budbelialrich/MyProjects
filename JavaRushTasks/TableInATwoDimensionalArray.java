package JavaRushTasks;

/*ѕроинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
заполни его таблицей умножени€ и выведи в консоли в следующем виде:
1 2 3 4 Е 2 4 6 8 Е 3 6 9 12 Е 4 8 12 16 Е Е „исла в строке разделены пробелом.*/

import java.util.Arrays;

public class TableInATwoDimensionalArray {
    public static void main(String[] args) {

        int a = 0;

        int [][] multiTable = new int[10][10];

        for(int i = 1; i < multiTable.length; i++){
            ++a;
            System.out.println();
           for(int j = 1; j < multiTable[i].length; j++){
               multiTable [i][j] = j * a;
               System.out.print(multiTable[i][j] + " ");
           }
        }
    }
}
