class Solution {
    public int smallestNumber(int n, int t) {

        for(int i=n; i<=n+10; i++) {
            if(divisible(i, t)) {
                return i;
            }
        }

        return -1;
        
    }

    private boolean divisible(int number, int t) {
        int product = 1;

        while(number > 0) {
            int remainder = number % 10;
            product = product * remainder;
            number = number / 10;
        }

        if(product % t == 0) {
            return true;
        }

        return false;

    }
}