class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        for(int i=n-2; i>=0; i--) {
            for(int j=0; j<triangle.get(i).size(); j++) {
                int left = triangle.get(i+1).get(j);
                int right = triangle.get(i+1).get(j+1);

                int updated = triangle.get(i).get(j) + Math.min(left,right);

                triangle.get(i).set(j, updated);
            }
        }

        return triangle.get(0).get(0);
        
    }
}