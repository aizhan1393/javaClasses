package Optional1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[2][10];
        int[] lengthArray = new int[10];

        for(int j = 0; j < 10; j++){
            String temp = reader.readLine();
            array[0][j] = Integer.parseInt(temp);
            array[1][j] = temp.length();
        }



        System.arraycopy(array[1], 0, lengthArray, 0, 10);
        Arrays.sort(lengthArray);

        int sizeOfLengthArray = lengthArray.length;

        for (int i = 0; i < sizeOfLengthArray; i++) {
            for (int j = i + 1; j < sizeOfLengthArray; j++) {
                if (lengthArray[i] == lengthArray[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < sizeOfLengthArray; k++, shiftLeft++) {
                        lengthArray[shiftLeft] = lengthArray[k];
                    }
                    sizeOfLengthArray--;
                    j--;
                }
            }
        }

        int[] finishLengthArray = new int[sizeOfLengthArray];
        if (sizeOfLengthArray >= 0) System.arraycopy(lengthArray, 0, finishLengthArray, 0, sizeOfLengthArray);

        for (int k : finishLengthArray) {
            for (int j = 0; j < 10; j++) {
                if (k == array[1][j])
                    System.out.println(array[0][j]);
            }
        }
    }

}
