package HackerRank;

public class RepeatedAddition {
    public static int solve(int n) {
        if (n < 10) {
            return n;
        }
        int res = n;
        while (res >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            res = sum;
            n = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve(1234));
    }
}
