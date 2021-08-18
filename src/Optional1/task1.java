package Optional1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[2][10];
        int[] lengthArray = new int[10];
        int minLength;
        int maxLength;

        for(int j = 0; j < 10; j++){
            String temp = reader.readLine();
            array[0][j] = Integer.parseInt(temp);
            array[1][j] = temp.length();
        }

        System.arraycopy(array[1], 0, lengthArray, 0, 10);
        Arrays.sort(lengthArray);
        minLength = lengthArray[0];
        maxLength = lengthArray[9];


        for(int j = 0; j < 10; j++){
            if(array[1][j] == minLength)
                System.out.println("The shortest number is " + array[0][j]);
            if (array[1][j] == maxLength)
                    System.out.println("The longest number is " + array[0][j]);
            }
    }
}
