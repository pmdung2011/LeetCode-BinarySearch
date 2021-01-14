import java.util.ArrayList;
import java.util.Arrays;

public class ParenthesesGrouping {
    public static String[] solve(String s) {
        var grp = new ArrayList<>();
        int sum = 1;
        int i = 1;

        while(s.length() > 0 && i <= s.length()-1){
            sum += (s.charAt(i++)=='(') ? 1 : -1;
            if(sum == 0){
                grp.add(s.substring(0,i));
                s = s.substring(i, s.length());
                sum = 1;
                i = 1;
            }
        }
        return grp.toArray(new String[grp.size()]);
    }

    public static void main(String[] args) {
        String s = "()()(()())";
        System.out.println(Arrays.toString(solve(s)));

    }
}
