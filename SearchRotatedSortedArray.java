public class SearchRotatedSortedArray {
    /**
     * The idea is using Binary Search
     *      Step 1: Find the pivot
     *          The pivot's position happens in two cases:
     *              Case 1 (pivot is on right side): 4 5 6 1 2 3
     *                      l   m     r
     *                      nums[m] >= nums[l]
     *              Case 2 (pivot is on left side): 5 6 1 2 3 4
     *                      l   m     r
     *                      nums[m] < nums[l]
     *      Step 2: Locate the target (right or left of the pivot)
     *      NOTICE: If pivot is on the right side, locate target on left first, and vice versa.
     *              - Compare target >,<,= only with nums[left/right] NOT nums[mid]
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int solve(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2; //avoid overflow

            //found the target
            if(nums[mid] == target) return mid;

            //Locate the pivot's cases
            //Case 1:
            if(nums[mid] >= nums[left]){
                //Locate target's side
                //Target is on the right side [m - r]
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                //Target is on the left side
                else{
                    left = mid + 1;
                }
            }
            //Case 2:
            else{
                //Locate target's side
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                //Target is on the left side
                else{
                    right = mid - 1;
                }
            }
        }
        return -1; //invalid target
    }
}
