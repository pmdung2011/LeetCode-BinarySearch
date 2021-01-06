package HackerRank;

public class InverseFactorial {
    public static int solve(int a) {
        int res = 1;
        int index = 1;
        for (int i = 1; i <= a / 2; i++) {
            res *= i;
            if (res == a) {
                index = i;
                return index;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve(6));
    }
}
