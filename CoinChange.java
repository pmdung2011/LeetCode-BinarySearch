//

import java.util.Arrays;

public class CoinChange {
    // m is size of coins array
    // (number of different coins)
    // static int minCoins(int[] C, int m, int n)
    // {
    // // table[i] will be storing
    // // the minimum number of coins
    // // required for i value. So
    // // table[V] will have result
    // int[] dp = new int[n + 1];
    //
    // // Base case (If given value V is 0)
    // dp[0] = 0;
    //
    // // Initialize all table values as Infinite
    // Arrays.fill(dp,Integer.MAX_VALUE);
    //
    // // Compute minimum coins required for all
    // // values from 1 to V
    // for (int i = 1; i <= n; i++)
    // {
    // // Go through all coins smaller than i
    // for (int j = 0; j < m; j++)
    // if (C[j] <= i)
    // {
    // int sub_res = dp[i - C[j]];
    // if (sub_res != Integer.MAX_VALUE
    // && sub_res + 1 < dp[i])
    // dp[i] = sub_res + 1;
    // }
    //
    // }
    // return dp[n];
    //
    // }

    static int minCoinChange(int[] C, int m, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0; //base case
        for (int i = 1; i <= n; i++) {
            int minimum = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (i >= C[j]) {
                    minimum = Math.min(minimum, 1 + dp[i - C[j]]);
                }
            }
            dp[i] = minimum;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 4, 9 };
        int m = coins.length;
        int n = 16;
        System.out.println(minCoinChange(coins, m, n));
    }
}
