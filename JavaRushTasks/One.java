package JavaRushTasks;

public class One {
    public static void main(String[] args) {
        int a;
        int b = 1;
        while (b <= 10) {
            for (int i = 1; i <= 10; i++) {
                a = i * b;
                System.out.print(a + " ");
            }
            System.out.println();
            b++;
        }
    }
}
