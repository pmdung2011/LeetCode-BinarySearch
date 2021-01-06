package HackerRank;

public class OddNumberOfDigits {
    public static int solve(int[] nums) {
        int oddCounter = 0;
        int oddNums = 0;
        for (int i : nums) {
            while (i >= 1) {
                i /= 10;
                oddCounter++;
            }
            if (oddCounter % 2 != 0) {
                oddNums++;
            }
            oddCounter = 0;
        }
        return oddNums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 800, 22, 5};
        System.out.println(solve(nums));

    }
}
