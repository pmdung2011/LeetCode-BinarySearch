import java.util.ArrayList;
import java.util.Iterator;

//LeetCode
//27.Remove Element
//Space complexity must be O(1)
public class RemoveElement {
    public static int removeELement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }
        //The idea is to move number != val to the front of the array
        //Then return the number of elements we push to the front, which is j
        int j = 0; //reference to front index
        for(int i : nums){
            //if the element is != val, move to the front
            if(i != val){
                nums[j++] = i; //then increase the index i
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeELement(nums,3));
    }
}
