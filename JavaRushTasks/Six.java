package JavaRushTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            int m = Integer.parseInt(reader.readLine());
            sum += m;
            if (m == -1)
            break;
        }
        sum++;
        System.out.println(sum);
    }
}
