class Solution {
    public int climbStairs(int n, int[] costs) {
        
        int dp[] = new int[n+1];
        
        dp[0] = 0;

        dp[1] = cost(costs, 0, 1);

        if(n <= 1) {
            return dp[1];
        }

        dp[2] = Math.min(dp[1] + cost(costs, 1, 2), cost(costs, 0, 2));

        for(int i=3; i<=n; i++) {

            int cost1 = cost(costs, i-1, i);
            int cost2 = cost(costs, i-2, i);
            int cost3 = cost(costs, i-3, i);

            dp[i] = Math.min(cost1+dp[i-1], Math.min(cost2+dp[i-2], cost3+dp[i-3]));

        }

        return dp[n];

    }

    private int cost(int costs[], int i, int j) {
        return costs[j-1] + (j-i)*(j-i);
    }
}