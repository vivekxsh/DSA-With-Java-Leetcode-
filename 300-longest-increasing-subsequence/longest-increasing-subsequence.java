class Solution {
    public int lengthOfLIS(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        int[] helperArr = new int[set.size()];
        int index = 0;
        for(int val : set) {
            helperArr[index++] = val;
        }

        Arrays.sort(helperArr);
        return LIS(nums, helperArr);
        
    }

    private int LIS(int[] nums, int[] helperArr) {

        int n = nums.length;
        int m = helperArr.length;

        int[][] dp = new int[n+1][m+1];
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(nums[i-1] == helperArr[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];

    }
}