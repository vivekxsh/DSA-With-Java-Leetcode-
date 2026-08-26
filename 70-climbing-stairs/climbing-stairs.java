class Solution {
    public int climbStairs(int n) {

        // recursion -> got tle
        // if(n == 1 || n == 2) {
        //     return n;
        // }

        // return climbStairs(n-1)+climbStairs(n-2);

        // memoization

        if(n==1 || n==2) {
            return n;
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        dp[2] = 2;

        return helper(n, dp);
        
    }

    public int helper(int n, int[] dp) {

        if(n == 1 || n==2) {
            return n;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = helper(n-1, dp) + helper(n-2, dp);

        return dp[n];
    }
}