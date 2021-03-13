public class TrapRainWater {
    public static int trapRainWater(int[] nums) {
        if (nums.length == 0)
            return 0;
        int left = 0, right = nums.length - 1;
        int ans = 0;
        int leftMax = nums[left], rightMax = nums[right];

        while (left < right) {
            if (leftMax < rightMax) {
                ans += (leftMax - nums[left++]);// 2 1 3 -> trap 1 unit of water
                leftMax = Math.max(leftMax, nums[left]); // update leftMax
            } else {
                ans += (rightMax - nums[right--]);
                rightMax = Math.max(rightMax, nums[right]);
            }
        }
        return ans;
    }
}
