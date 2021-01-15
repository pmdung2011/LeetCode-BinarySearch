import java.util.Arrays;

//BinarySearch
//Given a list of integers nums, swap each consecutive even indexes with each other,
// and swap each consecutive odd indexes with each other.
public class SwapConsecutivePairs {
    public static int[] solve(int[] nums){
        int i = 0;
        while (i < nums.length - 2) {
            int temp = nums[i];
            nums[i] = nums[i + 2];
            nums[i + 2] = temp;
            if (i % 2 == 1)
                i = i + 3;
            else
                i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,5,6,4,8,9,10,11};
        System.out.println(Arrays.toString(solve(nums)));
    }
}
