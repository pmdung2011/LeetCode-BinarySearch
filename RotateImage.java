package HackerRank;

public class RotateImage {
    public void rotate(int[][] matrix) {
        // The pattern is change the first row to last column and so on
        int len = matrix.length;
        //Step 1: Transpose matrix, row to column
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Step 2: swap first digit of the row with the last digit of the row
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = temp;
            }
        }

    }
}
