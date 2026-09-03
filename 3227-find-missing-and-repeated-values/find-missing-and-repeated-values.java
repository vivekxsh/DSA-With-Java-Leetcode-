class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid[0].length;
        Set<Integer> set = new HashSet<>();

        int repeated = -1;
        int missing = -1;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {

                if(set.contains(grid[i][j])) {
                    repeated = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }

        for(int i=1; i<=n*n; i++) {
            if(!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
        
    }
}