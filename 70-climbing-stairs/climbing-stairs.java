class Solution {
    public int climbStairs(int n) {
        
        // int dp[] = new int[n+1];

        // Arrays.fill(dp, -1);

        // return helper(n, dp);

        if(n <= 1) {
            return n;
        }
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];

    }

    private int helper(int n, int dp[]) {

        if(n == 1 || n == 2) {
            return n;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = helper(n-1, dp) + helper(n-2, dp);

        return dp[n];

    }
}