import java.util.*;
//448. Find All Numbers Disappeared in an Array
public class AllDisapperNum {
    public static List<Integer> solve(int[] nums){
        List<Integer> res = new ArrayList<>();
        // Since the array will start from 1, so the index and value will be like
        //Assume in sorted order
        //Index: 0 1 2 3 4 5 6
        //Value: 1 2 3 4 5 6 7
        //We do not have to worry about the order, the idea is, check if the number is exist
        //for example, value 4 at index 3 is exist, then turn that value to negative

        for(int i : nums){
            int index = Math.abs(i)-1; //There will be some duplicate nums, get abs value before get the index
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }

        //The remain positive values are missing nums
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] temp = new int[nums.length+1];

        for(int i : nums){
            temp[i]++;
        }

        for(int i = 1; i < temp.length; i++){
            if(temp[i]==0){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums ={4,3,2,7,8,2,3,1};

        System.out.println(solve(nums).toString());
    }
}
