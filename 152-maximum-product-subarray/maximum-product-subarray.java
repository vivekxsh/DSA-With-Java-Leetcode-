class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
            // int currProduct = 1;

        for(int i=0; i<nums.length; i++) {

            int currProduct = 1;
            for(int j=i; j<nums.length; j++) {
                currProduct = currProduct * nums[j];

                maxProduct = Math.max(maxProduct, currProduct);
            }

            // currProduct = currProduct * (nums[i] * nums[i-1]);
            // currProduct = currProduct * nums[i];
            // if(currProduct <= 0) {
            //     currProduct = 1;
            // }
            // maxProduct = Math.max(maxProduct, currProduct);

        }

        return maxProduct;
        
    }
}