//268.Missing Number
public class MissingNumber {
    public static int solve(int[] nums){
        int sum = 0, sum_in = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum += i;
            sum_in += nums[i];
        }
        int test = 0;
        for(int i = 1; i <= nums.length; i++){
            test += i;
        }
        System.out.println(test);
        System.out.println(sum);
        System.out.println(sum_in);
        return (sum+nums.length)-sum_in;
    }

    public static void main(String[] args) {
        int[] a = {1,0,3};
        System.out.println(solve(a));
    }
}
