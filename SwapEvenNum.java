package HackerRank;

public class SwapEvenNum {
    public int[] solve(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            // check if the index has changed
            if (nums[i] % 2 == 0 && index == -1) {
                index = i; // keep track of even num
            }
            // if index != -1. index already has position of even num
            else if (nums[i] % 2 == 0) {
                // swap here
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                //After swap, reset the index
                index = -1;
            }
        }
        return nums;
    }
}
