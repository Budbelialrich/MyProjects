package JavaRushTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];

        System.out.println("Ведите значение: ");

        for (int i = 0; i < strings.length; i++)
        {
            strings[i] = reader.readLine();
        }
       for(int i = 0; i < strings.length; i++){
           System.out.println(strings[strings.length - 1] );

       }
    }
}
