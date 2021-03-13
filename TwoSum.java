import java.sql.SQLOutput;
import java.util.*;
public class TwoSum {
    //O(n) time
    //O(n) space
    public static int[] solve(int[] nums, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = sum - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    //O(n) time
    //O(1) space
    //
    public static int[] solve2(int[] nums, int sum){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int targetDiff = sum - nums[left];
            if(targetDiff == nums[right]){
                return new int[]{left, right};
            }
            if(targetDiff > nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,6};
        System.out.println(Arrays.toString(solve2(nums,6)));
    }
}
