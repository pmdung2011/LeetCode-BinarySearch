//

public class ZSum {
    public static int solve(int[][] matrix) {
        // n x n matrix
        int n = matrix[0].length;
        int sum = 0;
        // calculate first and last row
        for (int i = 0; i < n; i++) {
            sum += matrix[0][i]; // first row
            sum += matrix[matrix.length - 1][i]; // last row
        }
        int k = n - 1;
        for (int i = 1; i <= n / 2; i++) {
            sum += matrix[i][k - 1];
            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(solve(matrix));
    }
}
