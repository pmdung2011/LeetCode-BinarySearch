//

import java.lang.reflect.Array;
import java.util.Arrays;

public class MiniMaxSum {
    // private static int[] sortArray(int[] nums){
    // int temp;
    // for (int i = 1; i < nums.length/2; i++) {
    // temp = nums[i];
    // if(temp > nums[nums.length - 1 - i]){
    // nums[i] = nums[nums.length - 1 - i];
    // nums[nums.length - 1 - i] = temp;
    // }
    // }
    // return nums;
    // }

    public static void minimaxSum(int[] arr) {
        int minSum, maxSum;
        long sum = 0;
        // Get the total sum
        for (int i : arr) {
            sum += i;
        }
        // Sort the array
        Arrays.sort(arr);

        minSum = arr[0];
        maxSum = arr[arr.length - 1];
        System.out.println((sum - maxSum) + " " + (sum - minSum));
    }

    public static void main(String[] args) {
        int[] a = { 256741038, 623958417, 467905213, 714532089, 938071625 };
        int[] b = { 1, 2, 3, 4, 5 };

        minimaxSum(a);
    }
}
