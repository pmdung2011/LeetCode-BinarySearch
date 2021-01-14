//BinarySearch

public class ConsecutiveOnes {
    public static boolean solve(int[] nums){
        int f = -1;
        int l = -1;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (f == -1) {//mean the very first one
                    f = i;
                }
                l = i;
                c++;
            }
        }
        System.out.println(c);
        System.out.println(f);
        System.out.println(l);
        return (c == l - f + 1);
    }

    public static void main(String[] args) {
        int[] nums ={1,0,1,1,12,4,1,1};
        System.out.println(solve(nums));
    }
}
