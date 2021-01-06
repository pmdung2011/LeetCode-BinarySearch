package HackerRank;

public class maxSubArray {
    public static int maximumSubArray(int[] nums) {
        int max_temp = nums[0], max_final = nums[0];
        for(int i =1; i < nums.length; i++){
            max_temp = Math.max(nums[i], max_temp + nums[i]);
            max_final = Math.max(max_temp, max_final);
        }
        return max_final;
    }

    public static void main(String[] args){
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray(array));
    }
}
