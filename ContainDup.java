package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDup {
    //O(n^2)
    public static boolean checkDup1(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                System.out.println("nums[i]: i=" + i +" " + nums[i]);
                System.out.println("nums[j]: j=" + j + " " + nums[j]);
                System.out.println("====================");
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    //O(nlogn)
    public static boolean checkDup2(int[] nums){
        Arrays.sort(nums); //O(nlogn)
        //O(n)
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    //O(n)
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}
