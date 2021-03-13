import java.util.Arrays;

//LeetCode
//238. Product of Array Except Self
public class ProductOfArrayExceptSelf {
    //O(n) Runtime
    //O(n) Space
    public static int[] productExceptSelf(int[] nums){
        if(nums.length == 0) return new int[] {};
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i = 0; i < n; i++){
            res[i] = left[i] * right[i];
        }
        return res;
    }

    //O(n) runtime
    //O(1) Space
    public static int[] solve(int[] nums){
        int n = nums.length;
        int[] res = new int[n];

        //Left
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        //Right
        int R = 1;
        for(int i = n -1; i>=0; i--){
            res[i] = res[i] * R;
            R *= nums[i];
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(solve(nums)));
    }
}
