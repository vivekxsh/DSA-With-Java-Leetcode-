class Solution {

    private int recursionSolution(String text1, String text2, int n, int m) {

        if(n == 0 || m == 0) {
            return 0;
        }

        if(text1.charAt(n-1) == text2.charAt(m-1)) {
            return recursionSolution(text1, text2, n-1, m-1) + 1;
        }
        else{
            int ans1 = recursionSolution(text1, text2, n-1, m);
            int ans2 = recursionSolution(text1, text2, n, m-1);

            return Math.max(ans1, ans2);
        }
    }

    private int memoization(String text1, String text2, int n, int m, int[][] dp) {

        if(n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != 0) {
            return dp[n][m];
        }

        if(text1.charAt(n-1) == text2.charAt(m-1)) {
            dp[n][m] = memoization(text1, text2, n-1, m-1, dp) + 1;
        }
        else{
            int ans1 = memoization(text1, text2, n-1, m, dp);
            int ans2 = memoization(text1, text2, n, m-1, dp);

            dp[n][m] = Math.max(ans1, ans2);
        }

        return dp[n][m];

    }

    public int longestCommonSubsequence(String text1, String text2) {

        // int dp[][];
        // return memoization(text1, text2, text1.length(), text2.length(), new int[text1.length()+1][text2.length()+1]);

       int n = text1.length();
       int m = text2.length();

       int[][] dp = new int[n+1][m+1];
       for(int i=1; i<n+1; i++) {
        for(int j=1; j<m+1; j++) {
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1]+1;
            }
            else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
       }

       return dp[n][m];
        
    }
}