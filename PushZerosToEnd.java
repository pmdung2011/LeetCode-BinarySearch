//

import java.util.Arrays;

public class PushZerosToEnd {
    public static int[] solve(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int num : nums) {
            if (num != 0) {
                arr[counter++] = num;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 0, 3 };
        System.out.println(Arrays.toString(solve(nums)));
    }
}
