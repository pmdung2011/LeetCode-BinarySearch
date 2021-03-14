//

import java.util.Arrays;

public class MaxSumKNegate {
    public static int solve(int[] arr, int k) {
        int sum = 0;
        if (arr.length == 0) {
            return sum;
        }
        Arrays.sort(arr);
        int i = 0;

        while (k > 0) {
            // If we find a 0 in our
            // sorted array, we stop
            if (arr[i] == 0)
                k = 0;

            if (arr[i] < 0) {
                arr[i] = (-1) * arr[i];
                k--;
            }
            i++;
        }

        for (int value : arr) {
            sum += value;
        }

        return sum;

    }

    public static void main(String[] args) {
        int array[] = { 1, 1 };
        System.out.println(solve(array, 9));
    }
}
