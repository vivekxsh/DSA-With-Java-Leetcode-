class Solution {

    int n;
    int[][] dp;
    public int maxValue(int[][] events, int k) {
        
        n = events.length;
        Arrays.sort(events, (a,b) -> a[0]-b[0]);

        dp = new int[k+1][n];
        for(int d[] : dp) {
            Arrays.fill(d, -1);
        }

        return util(events, k, 0);

    }

    int util(int[][] events, int k, int curr) {
        if(k == 0 || curr == n) {
            return 0;
        }

        if(dp[k][curr] != -1) {
            return dp[k][curr];
        }

        int nextIndex = getNext(events, events[curr][1]);
        int include = events[curr][2] + util(events, k-1, nextIndex);
        int exclude = util(events, k, curr+1);

        dp[k][curr] = Math.max(include, exclude);

        return dp[k][curr];

    }

    int getNext(int[][] events, int endDay) {

        int left = 0;
        int right = events.length;

        while(left < right) {
            int mid = left + (right-left)/2;

            if(events[mid][0] <= endDay) {
                left = mid+1;
            }
            else{
                right = mid;
            }
        }

        return left;

    }
}