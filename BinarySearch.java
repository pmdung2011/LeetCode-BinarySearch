public class BinarySearch {
    public int solve(int[] nums, int target){
        //Built-in function
        //int res = Arrays.binarySearch(nums,target);

        //from scratch
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return -1;
    }
}
