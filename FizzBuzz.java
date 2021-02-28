
import java.util.Arrays;

public class FizzBuzz {
    public static String[] solve(int n) {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 15 == 0) {
                res[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                res[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                res[i] = "Buzz";
            } else {
                res[i] = Integer.toString(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(5)));
    }
}
