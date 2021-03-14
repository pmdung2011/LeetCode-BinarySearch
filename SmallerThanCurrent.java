//

import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
/*Given the array nums, for each nums[i]
 find out how many numbers in the array are smaller than it.
 That is, for each nums[i] you have to count the number of valid j's such that
 j != i and nums[j] < nums[i].

Return the answer in an array.
*/
public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int counter = 0;
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    counter++;
                }

            }
            count[i] = counter;
            counter = 0;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = { 8, 1, 2, 2, 6 };
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Compared Array: " + Arrays.toString(smallerNumbersThanCurrent(a)));
    }
}
