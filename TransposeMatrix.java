package HackerRank;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] solve(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (col < 1) {
            return matrix;
        }
        int[][] res = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                res[r][c] = matrix[c][r];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{}, {}};
        System.out.println(Arrays.deepToString(solve(matrix)));
    }
}
