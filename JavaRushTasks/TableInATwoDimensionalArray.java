package JavaRushTasks;

/*���������������� ������ MULTIPLICATION_TABLE ��������� new int[10][10],
������� ��� �������� ��������� � ������ � ������� � ��������� ����:
1 2 3 4 � 2 4 6 8 � 3 6 9 12 � 4 8 12 16 � � ����� � ������ ��������� ��������.*/

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
