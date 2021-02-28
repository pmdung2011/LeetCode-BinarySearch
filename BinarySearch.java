//Search a target in sorted array
public class BinarySearch {
    public static int solve(int[] nums, int target){
        //Built-in function
        //int res = Arrays.binarySearch(nums,target);

        //from scratch
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2; //To avoid overflow since every step of the operation is bounded by the value of right.

            //Found the target
            if(target == nums[mid]){
                return mid;
            }
            //Target in the right half
            else if (target > nums[mid]){
                left = mid + 1;
            }

            //target in the left half
            else{
                right = mid - 1;
            }
        }
        //In case the target is not in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0,4,5,8,23,56,77,100,123};
        System.out.println(solve(nums, 23));
    }
}
