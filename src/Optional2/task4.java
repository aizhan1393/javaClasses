package Optional2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sizeofMatrix = Integer.parseInt(reader.readLine());
        int max = 10;
        int min = -10;
        int[][] matrix = new int[sizeofMatrix][sizeofMatrix];



        for (int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }

        for(int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxNumber = matrix[0][0];
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

        for(int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                if (matrix[i][j] >= maxNumber) {
                    maxNumber = matrix[i][j];
                    }
            }
        }

        for(int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                if (matrix[i][j] == maxNumber) {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        Set<Integer> rowSet = new HashSet<>(row);
        Set<Integer> columnSet = new HashSet<>(column);

        int[][] resultMatrix = new int[matrix.length - rowSet.size()][matrix.length - columnSet.size()];

        for(Integer elem: rowSet){
            System.out.println(elem);
        }

        for(Integer elem: columnSet){
            System.out.println(elem);
        }

        int newArrI = 0;
        int newArrJ;
        for(int i = 0; i < matrix.length; i++) {
            if (!rowSet.contains(i)) {
                newArrJ = 0;
                for (int j = 0; j < matrix.length; j++) {
                    if (!columnSet.contains(j)) {
                        resultMatrix[newArrI][newArrJ] = matrix[i][j];
                        newArrJ++;
                    }
                }
                newArrI++;
            }
        }
        for (int[] element : resultMatrix) {
            for (int j = 0; j < resultMatrix.length; j++) {
                System.out.print(element[j] + " ");
            }
            System.out.println();
        }
    }
}
