package JavaRushTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        if ((number1 >= number2 && number1 <= number3) || (number1 <= number2 && number1 >= number3)) {
            System.out.println(number1);
        } else if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}
