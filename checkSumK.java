


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/
public class checkSumK {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            if (map.containsKey(target - num)) {
                return new int[]{map.get(target - num), i};
            } else {
                map.put(num, i);
            }
            i++;
        }
        return new int[]{};
    }

    //Brute force method with O(n^2)
    public static int[] checkSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Invalid");

    }


    public static void main(String[] args) {
        int[] nums = {3, 3};

        System.out.println(Arrays.toString(checkSum(nums, 6)));
    }

}
