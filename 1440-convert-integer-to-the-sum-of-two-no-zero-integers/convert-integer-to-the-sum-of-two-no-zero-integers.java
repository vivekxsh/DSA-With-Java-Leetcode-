class Solution {
    public int[] getNoZeroIntegers(int n) {

        for(int i=1; i<n; i++) {
            if(nonZero(i) && nonZero(n-i)) {
                return new int[]{i, n-i};
            }
        }

        return new int[0];
        
    }

    boolean nonZero(int n) {

        while(n > 0){
            if(n%10 == 0){
                return false;
            }
            n = n/10;
        }

        return true;
    }
}