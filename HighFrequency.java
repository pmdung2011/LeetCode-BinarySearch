//

import java.util.*;

public class HighFrequency {
    public static int solve(int[] nums) {
        int res = 0;
        // Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) { // if see the repeat, update the value
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            res = Math.max(res, value);

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 7, 1, 7, 1, 1 };
        System.out.println(solve(nums));
    }
}
