//70. Climbing Stairs
public class ClimbingStairs {
    public int solve(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n]; //the final result will be the combination of the two previous steps
    }

    public int solve2 (int n){
        //base case
        if(n <= 1) return 1;
        int prev1 = 1; //in case one stair, only one way
        int prev2 = 2; //two stairs, there are two ways (can climb 1 or 2 steps)

        for(int i = 3; i <= n; i++){
            int newStep = prev1 + prev2; //the next result is the number of ways of two previous ways
            //move up the ways
            prev1 = prev2;
            prev2 = newStep;
        }
        return prev2;
    }
}
