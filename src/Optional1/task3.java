package Optional1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[2][10];

        for(int j = 0; j < 10; j++){
            String temp = reader.readLine();
            array[0][j] = Integer.parseInt(temp);
            array[1][j] = temp.length();
        }
        reader.close();

        int sum = 0;
        for (int j = 0; j < 10; j++) {
            sum = sum + array[1][j];
        }
        int averageLength = sum / 10;
        System.out.println(averageLength);

        for (int j = 0; j < 10; j++) {
            if (array[1][j] > averageLength)
                System.out.println(array[0][j] + " has the length longer than average length: " + array[1][j]);
        }

        for (int j = 0; j < 10; j++) {
            if (array[1][j] < averageLength)
                System.out.println(array[0][j] + " has the length shorter than average length: " + array[1][j]);
        }
    }
}
