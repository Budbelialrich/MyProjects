package JavaRushTasks;

/*—оздай треугольный массив,
где значение каждого элемента Ч это сумма его индексов.*/

import java.util.ArrayList;

public class TriangleArray {
    public static void main(String[] args) {
        int weight = 5;

        int[][] array = new int[weight][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
