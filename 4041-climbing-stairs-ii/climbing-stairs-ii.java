class Solution {
    public int climbStairs(int n, int[] costs) {
        
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = cost(costs, 0, 1);

        if(n == 1) {
            return dp[1];
        }

        dp[2] = Math.min(dp[1] + cost(costs, 1,2), cost(costs, 0,2));

        for(int i=3; i<=n; i++) {
            int c1 = cost(costs, i-1, i);
            int c2 = cost(costs, i-2, i);
            int c3 = cost(costs, i-3, i);

            dp[i] = Math.min(dp[i-1]+c1, Math.min(dp[i-2]+c2, dp[i-3]+c3));

        }

        return dp[n];

    }

    private int cost(int[] costs, int i, int j) {
        return costs[j-1]+(j-i)*(j-i);
    }
}