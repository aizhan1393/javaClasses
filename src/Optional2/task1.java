package Optional2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sizeofMatrix = Integer.parseInt(reader.readLine());
        int max = 10;
        int min = -10;
        int k = 2;
        int[][] matrix = new int[sizeofMatrix][sizeofMatrix];
        int[] buffer = new int[sizeofMatrix];


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

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < sizeofMatrix - 1; i++) {
                if (matrix[i][k] > matrix[i + 1][k]) {
                    for (int j = 0; j < sizeofMatrix; j++) {
                        buffer[j] = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = buffer[j];
                    }
                    isSorted = false;
                }
            }

        }

        for(int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
