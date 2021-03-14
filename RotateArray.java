//
//Given an array, rotate the array to the right by k steps, where k is non-negative
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        // 1 2 3 4 5, k = 3
        // The pattern takes (k%nums.length) steps to get the result
        // The process takes 3 steps
        // 5 4 3 2 1 -> reverse whole array
        // 3 4 5, 1 2 -> the result, reverse two parts
        // k

        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
