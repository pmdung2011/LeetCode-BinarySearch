//

public class LongestDupString {
    public static int solve(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int longest = 1;
        int counter = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                counter++;
                longest = Math.max(longest, counter);
            } else {
                counter = 0;
            }
        }
        return longest + 1;
    }

    public static void main(String[] args) {
        String s = "abbbbbabaa";
        System.out.println(solve(s));
    }
}
