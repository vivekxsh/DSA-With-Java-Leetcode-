class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int maxOne = 0;
        int index = 0;

        int m = mat.length;
        int n = mat[0].length;

        for(int i=0; i<m; i++) {

            int countOnes = 0;
            for (int j=0; j<n; j++) {

                if(mat[i][j] == 1) {
                    countOnes++;
                }
            }

            if(countOnes > maxOne) {
                maxOne = countOnes;
                index = i;
            }

        }

        return new int[]{index, maxOne};

        
    }
}