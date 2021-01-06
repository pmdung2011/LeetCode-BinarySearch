package HackerRank;

import java.util.Arrays;

public class ListCalculator {
    public static int[] solve(int[] nums, String op, int val) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (op.equals("+")) {
                nums[i] += val;
            } else if (op.equals("-")) {
                nums[i] -= val;
            } else if (op.equals("/")) {
                nums[i] /= val;
            } else if (op.equals("*")) {
                nums[i] *= val;
            }
            res[i] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 6};
        System.out.println(Arrays.toString(solve(arr, "+", 4)));
    }
}
