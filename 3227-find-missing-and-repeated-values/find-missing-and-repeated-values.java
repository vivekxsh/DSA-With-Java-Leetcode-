class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        

        ArrayList<Integer> helper = new ArrayList<>();
        int repeated = -1;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(!helper.contains(grid[i][j])) {
                    helper.add(grid[i][j]);
                }
                else{
                    repeated = grid[i][j];
                }
            }
        }

        Collections.sort(helper);
        int missing = -1;
        int start = 1;

        for(int num : helper) {
            if(num == start) {
                start++;
            }
            else{
                missing = start;
            }
        }

        if(missing == -1) {
            missing = helper.get(helper.size()-1) + 1;
        }

        return new int[]{repeated, missing};

    }
}