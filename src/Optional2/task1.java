package Optional2;
import java.util.concurrent.ThreadLocalRandom;

public class task1 {

    public static void main(String[] args) {
        int sizeofMatrix = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int min = (-1) * Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] matrix = new int[sizeofMatrix][sizeofMatrix];
        int[] buffer = new int[sizeofMatrix];

        for (int i = 0; i < sizeofMatrix; i++) {
            for (int j = 0; j < sizeofMatrix; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }

        for (int i = 0; i < sizeofMatrix - 1; i++) {
            if (matrix[i][k] > matrix[i + 1][k]) {
                for (int j = 0; j < sizeofMatrix; j++) {
                    buffer[j] = matrix[i][j];
                    matrix[i][j] = matrix[i + 1][j];
                    matrix[i + 1][j] = buffer[j];
                }
            }
        }
        }
    }
