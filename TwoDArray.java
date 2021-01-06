package HackerRank;

//hackerrank
public class TwoDArray {
    public static int hourglassSum(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int max = Integer.MIN_VALUE;

        //Be careful with out of bound of the array, because we have i/j + 2
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int cur_sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(max, cur_sum);
            }

        }
        return max;
    }
}
