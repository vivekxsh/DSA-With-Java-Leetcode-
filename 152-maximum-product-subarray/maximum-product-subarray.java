class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        // int currProduct = nums[0];

        for(int i=0; i<nums.length; i++) {

            int currProduct = 1;
            for(int j=i; j<nums.length; j++) {
                currProduct = currProduct * nums[j];

                maxProduct = Math.max(maxProduct, currProduct);
            }

            
            // currProduct = Math.max(currProduct*nums[i], nums[i]);
            // currProduct = currProduct*nums[i];

            // maxProduct = Math.max(currProduct, maxProduct);

        }

        return maxProduct;
        
    }
}