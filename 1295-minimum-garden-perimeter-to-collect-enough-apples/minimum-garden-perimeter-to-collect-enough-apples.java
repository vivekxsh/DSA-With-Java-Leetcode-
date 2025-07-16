class Solution {
    public long minimumPerimeter(long neededApples) {

        long n=0;
        long totalApples = 0;

        while(neededApples > totalApples) {
            n++;
            totalApples += 12*n*n;
        }

        return 8*n;
        
    }
}