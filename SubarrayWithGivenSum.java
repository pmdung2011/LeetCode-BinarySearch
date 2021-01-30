import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayWithGivenSum {

    public static int[] solve(int[] nums, int sum){
        int left_pointer = 0;
        int right_pointer = 0;
        int cur_sum = nums[0];
        //Array to store start and end index
        int[] index = new int[2];
        List<Integer> res = new ArrayList<>();
        res.add(nums[0]);
        for (int i = 1; i < nums.length ; i++) {
            if(cur_sum < sum){
                ++right_pointer;
                cur_sum += nums[right_pointer];
                res.add(nums[right_pointer]);
            }
            else if(cur_sum > sum){
                cur_sum -= nums[left_pointer];
                res.remove(0);
                left_pointer++;
            }
            else{
                break;
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size() ; i++) {
            result[i] = res.get(i);
        }

        index[0] = left_pointer+1;
        index[1] = right_pointer+1;
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,7,5};
        int sum = 12;

        System.out.println(Arrays.toString(solve(nums,sum)));
    }
}
