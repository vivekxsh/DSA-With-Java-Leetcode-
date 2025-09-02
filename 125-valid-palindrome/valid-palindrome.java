class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^a-zA-Z0-9]", "");

        str = str.toLowerCase();

        int start = 0, end = str.length()-1;

        while(start < end) {

            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }
}