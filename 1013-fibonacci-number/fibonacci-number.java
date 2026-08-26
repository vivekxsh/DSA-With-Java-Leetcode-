// class Solution {
//     public int fib(int n) {
        
//     }
// }

class Solution {
    public int fib(int n) {
        // recursion
        if(n==0 || n==1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}