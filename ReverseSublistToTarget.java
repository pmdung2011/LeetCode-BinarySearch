import java.util.Arrays;

//BinarySearch
//Given two lists of integers nums, and target, consider an operation where you take some sublist
// in nums and reverse it. Return whether it's possible to turn nums into target, given you can make any number of operations.
public class ReverseSublistToTarget {
    public static boolean solve (int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        Arrays.parallelSort(a); //parallelSort faster than normal built-in Sort
        Arrays.parallelSort(b);
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,5,9};
        int[] target = {4,5,5,0};
        System.out.println(solve(nums,target));
    }
}
