import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args){
        int[] a = {1,1,1,1,1};

        System.out.println(Arrays.toString(runningSum(a)));
    }
}
