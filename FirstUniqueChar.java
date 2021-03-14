//

import java.util.HashMap;
import java.util.Map;

//Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1
public class FirstUniqueChar {
    // Method 1
    public static int firstUniqChar(String s) {
        int l = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);// Increase the value of the key
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        // Check the frequency of value
        for (int j = 0; j < l; j++) {
            if (map.get(s.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;

    }

    public static int firstUnique2(String s) {
        char[] charArray = s.toCharArray();
        int[] values = new int[26];
        for (char c : charArray) {
            values[c - 'a']++;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (values[charArray[i] - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "lovelee";
        System.out.println(firstUniqChar(s));
    }
}
