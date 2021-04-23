import java.util.HashMap;
import java.util.Map;

/**
 * For every new character, we look for it in the already visited characters.
 * If the character has already been visited and is part of the current substring with non-repeating characters,
 * we update the start index. Otherwise, we'll continue traversing the string.
 * Since we are traversing the string only once, the time complexity will be linear, or O(n).
 * This approach is also known as the sliding window pattern.
 */
public class LongestSubstring {
    public static String solve(String input){
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
                //output.append(input, start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "aabbcdee";
        System.out.println(solve(s));
    }
}
