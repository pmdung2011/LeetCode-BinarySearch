package HackerRank;

//Given a list of integers nums sorted in ascending order and an integer k, return whether any two elements from the list add up to k. You may not use the same element twice.
//
//        Note: Numbers can be negative or 0.
public class SumListWithK {
    public static boolean solve(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == k)
                return true;
            else if (nums[left] + nums[right] < k)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0};
        int k = 0;
        System.out.println(solve(nums, k));
    }
}
