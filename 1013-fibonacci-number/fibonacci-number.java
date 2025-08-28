class Solution {
    public int fib(int n) {
        // if(n == 0 || n == 1) {
        //     return n;
        // }

        // return fib(n-1) + fib(n-2);


        // using dp (tabulation)

        // if(n==0 || n==1){
        //     return n;
        // }
        // int dp[] = new int[n+1];
        // dp[0] = 0;
        // dp[1] = 1;

        // for(int i=2; i<=n; i++) {
        //     dp[i] = dp[i-1] + dp[i-2];
        // }

        // return dp[n];


        // without dp

        if(n<=1){
            return n;
        }
        int fib = 0;
        int prev1 = 0;
        int prev2 = 1;
        for(int i=2; i<=n; i++) {
            fib = prev1 + prev2;

            int temp = prev1;
            prev1 = prev2;
            prev2 = fib;
        }

        return fib;
    }
}