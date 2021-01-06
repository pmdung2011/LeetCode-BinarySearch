package HackerRank;

import java.util.Arrays;

public class VowelsConsonantsSort {
    public static String solve(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (char c : charArr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb1.append(c);
            } else {
                sb2.append(c);
            }
        }
        return sb1.append(sb2.toString()).toString();
    }
}
