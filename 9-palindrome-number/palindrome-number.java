class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int number = x;

        int newNumber = 0;

        while(number != 0) {
            int digit = number % 10;
            newNumber = digit + newNumber * 10;
            number = number / 10;
        }

        return x == newNumber;
        
    }
}