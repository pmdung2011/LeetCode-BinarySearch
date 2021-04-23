public class MaxProductSubarray {
    public static int solve(int[] nums){
        if( nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0], min = nums[0], res = nums[0];

        for(int i = 1; i < nums.length; i++){
            int temp = max;
            //get the max value between max*nums[i], min*nums[i] and nums[i]
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            //get the min value between temp*nums[i], min*nums[i] and nums[i]
            min = Math.min(Math.min(temp*nums[i], min*nums[i]), nums[i]);

            if(max > res){
                res = max;
            }
        }
        return res;
    }
}
