class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for(String ope : operations) {

            if("X++".equals(ope) || "++X".equals(ope)) {
                x++;
            }
            else{
                x--;
            }

        }

        return x;
        
    }
}