package HackerRank;

import java.util.*;

/*Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
*/
public class IntersectionTwoArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> hs = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for (int i : nums1) {
            hs.add(i);
        }
        System.out.println(hs.toString());
        for (int j : nums2) {
            if (hs.contains(j)) {
                l.add(j);
                hs.remove((Integer) j);
            }
        }
        int[] a = new int[l.size()];
        //Convert List to array
        int count = 0;
        for (int k : l) {
            a[count++] = k;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {9, 4, 9, 8, 4};
        int[] b = {4, 4, 5};
        System.out.println(Arrays.toString(intersect(a, b)));
    }
}
