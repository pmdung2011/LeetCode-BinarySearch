

import java.util.Arrays;

/*
 * Input: ["flower","flow","flight"]
 *   Output: "fl" // phai co common prefix o tat ca element
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs); // important to sort the shortest string to the front of the array

        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "fight", "foa"};

        System.out.println(longestCommonPrefix(str));
    }
}
