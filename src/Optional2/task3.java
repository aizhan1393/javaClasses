package Optional2;

import java.util.concurrent.ThreadLocalRandom;

public class task3 {
    public static void main(String[] args) {
        int sizeofMatrix = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int min = (-1) * Integer.parseInt(args[1]);
        int[][] matrix = new int[sizeofMatrix][sizeofMatrix];



        for (int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }

        int maxNumber=matrix[0][0];
        int row = 0;
        int column = 0;

        for(int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        for(int k = 0; k < sizeofMatrix; k++){
            matrix[row][k] = 0;
        }

        for(int k = 0; k < sizeofMatrix; k++){
            matrix[k][column] = 0;
        }

    }
}
