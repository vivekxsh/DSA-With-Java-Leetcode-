class Solution {
    public int tribonacci(int n) {

        // ******* By using Recursion *******
        // if(n==0 || n==1){
        //     return n;
        // }

        // if(n==2) {
        //     return 1;
        // }

        // return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);


        // ***** By using DP [Tabulation method] *****
        // if(n <= 2){
        //     if(n==2){
        //         return 1;
        //     }
        //     else{
        //         return n;
        //     }
        // }

        // int dp[] = new int[n+1];
        // dp[0] = 0;
        // dp[1] = 1;
        // dp[2] = 1;

        // for(int i=3; i<=n; i++) {
        //     dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        // }

        // return dp[n];


        // ****** Normal Swapping technique *****
        if(n <= 2) {
            if(n==2) {
                return 1;
            }
            else{
                return n;
            }
        }

        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;

        for(int i=3; i<=n; i++) {
            int fib = prev1+prev2+prev3;

            int temp = prev1;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = fib;
        }

        return prev3;
        
    }
}