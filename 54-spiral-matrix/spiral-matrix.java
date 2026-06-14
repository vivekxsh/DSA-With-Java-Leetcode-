class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {

            // top
            for(int i=startCol; i<=endCol; i++) {
                ans.add(matrix[startRow][i]);
            }

            // right
            for(int i=startRow+1; i<=endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // bottom
            if(startRow < endRow) {
                for(int i=endCol-1; i>=startCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
            }

            // left
            if(startCol < endCol) {
                for(int i=endRow-1; i>=startRow+1; i--){
                    ans.add(matrix[i][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;


        }

        return ans;
        
    }
}