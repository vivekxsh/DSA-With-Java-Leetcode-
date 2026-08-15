class Solution {
    public int numTrees(int n) {
                
        int dp[] = new int[n+1];

        return catalanVariation(n, dp);

    }

    private int catalanVariation(int n, int[] dp) {
        if(n==0 || n==1) {
            return 1;
        }

        if(dp[n] != 0) {
            return dp[n];
        }

        int ans = 0;

        for(int i=0; i<n; i++) {
            ans += catalanVariation(i, dp) * catalanVariation(n-i-1, dp);
        }

        return dp[n] = ans;
    }
}