class Solution {
    public int[] getNoZeroIntegers(int n) {

        int num1 = -1;
        int num2 = -1;

        for(int i=1; i<n; i++) {
            if(nonZero(i) && nonZero(n-i)) {
                num1 = i;
                num2 = n-i;
                break;
            }
        }

        return new int[]{num1, num2};
        
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