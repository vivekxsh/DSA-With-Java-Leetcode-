class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> st = new HashSet<>();

        while(n != 1) {
            n = numSquare(n);

            if(st.contains(n)) {
                return false;
            }

            st.add(n);
        }

        return true;
        
    }

    int numSquare(int n) {
        int ans = 0;

        while(n != 0) {
            int digit = n%10;
            ans += digit*digit;
            n = n/10;
        }

        return ans;
    }
}