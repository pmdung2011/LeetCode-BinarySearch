package HackerRank;

import java.util.Arrays;

public class SortedElements {
    public static int solve(int[] nums) {
        int counter = 0;
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] org = new int[length];
        int larger = nums[0];
        System.arraycopy(nums, 0, org, 0, length);

        Arrays.sort(nums);

        for (int j = 0; j < length; j++) {
            if (org[j] == nums[j]) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 0};
        System.out.println(solve(arr));
    }
}
