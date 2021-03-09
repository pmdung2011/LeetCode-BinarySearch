//31. Next Permutation - Leetcode

import java.util.Arrays;

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
 * The replacement must be in place and use only constant extra memory.
 */
public class NextPermutation {
    /**
     * Break down idea:
     * 1.Find longest non-increasing suffix
     *      If no exist, then it is the largest permutation
     *      pivot is the element immediately to the left of the suffix.
     * 2.Find the right most element, greater than the pivot.
     * 3.Swap the found element with the pivot.
     * 4.Reverse the suffix.
     */
    public static boolean nextPermutation(int[] nums){
        //Find the non-increasing suffix
        //or Find the largest element in the array
        int i = nums.length -1;
        while(i > 0 && nums[i-1] >= nums[i]){
            i--;
        }

        //Now i is the head index of the suffix
        //Check if it is the largest permutation
        if(i<=0) return false;

        //Find the right-most element greater than the pivot
        //pivot is nums[i-1]
        int j = nums.length - 1;
        while(nums[i-1] >= nums[j]){
            j--;
        }
        //the element is nums[j]
        //Swap
        int temp = nums[i-1];
        nums[i-1] = nums[j];
        nums[j] = temp;

        //Reverse the suffix
        j = nums.length - 1;
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,4};
        do{
            System.out.println(Arrays.toString(arr));
        }while(nextPermutation(arr));
    }
}
