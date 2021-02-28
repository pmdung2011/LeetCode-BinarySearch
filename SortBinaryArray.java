import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Sort an array with 0 and 1
 */
public class SortBinaryArray {
    public static void solve(int[] arr){
        int j  = -1;
        /**
         * If arr[i] != 1, then swap with arr[j]
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                j++;
                //swap(arr[i], arr[j]);
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 1, 1,
                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
