//Leetcode
//3Sum

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * Notice that the solution set must not contain duplicate triplets.
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 */

/**
 * The complexity of this solution is O(n2) because we need to iterate over all
 * the numbers (which is O(n)) and for every selected number
 * find all pairs so that the sum would be 0 (which is O(n)
 * using two pointer technique)
 */
public class ThreeSum {
    public static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res; //It requires 3 nums at least in the array
        Arrays.sort(nums); //It takes O(nlogn) to sort but group same num together

        //Looking for X + Y + Z = 0 or X + Y = -Z
        //which are nums[i], nums[left], nums[right]
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[left] + nums[right];
                //In case we found the 3 nums
                if (currentSum == -nums[i]) {
                    res.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    //Skip the same num
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
                //Narrow down the section
                else if (currentSum > -nums[i]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> solve2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        int n = nums.length;
        // x  + y + z = target || y + z = target - x
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int curSum = nums[left] + nums[right];
                int requiredSum = target - nums[i];
                if (curSum == requiredSum) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                    //left++;
                } else if (curSum > requiredSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solve2(nums, 0));
    }
}
