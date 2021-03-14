//

import java.util.Arrays;

public class GroupStringIntoChunks {
    public static String[] solve(String s, int n) {
        String[] ans = new String[1 + ((s.length() - 1) / n)];
        for (int i = 0; i < s.length(); i += n) {
            ans[i / n] = s.substring(i, Math.min(i + n, s.length()));
            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int n = 3;
        System.out.println(Arrays.toString(solve(s, n)));
    }
}
