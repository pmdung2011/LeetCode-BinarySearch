import java.util.*;

/**
 * input:  aaabbccc
 * output: 3a2b3c
 */
public class CompressString {
    public static String solve(String s){
        if(s.length() == 0) return "";
        int count = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            count++;
            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                res.append(count).append(s.charAt(i));
                count = 0;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbc";
        System.out.println(solve(s));
    }
}
