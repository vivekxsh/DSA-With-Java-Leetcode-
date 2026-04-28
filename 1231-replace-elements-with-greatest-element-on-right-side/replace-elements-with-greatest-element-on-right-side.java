class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;

        for(int i=0; i<n-1; i++) {

            int greatest = 0;

            for(int j=i+1; j<n; j++) {

                greatest = Math.max(greatest, arr[j]);

            }
            arr[i] = greatest;

        }

        arr[n-1] = -1;

        return arr;
    }
}