class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;
        int[] altitude = new int[n+1];

        int k = 0;

        altitude[0] = 0;

        

        for(int i=0; i<gain.length; i++) {
            int sum = altitude[k] + gain[i];

            altitude[k+1] = sum;
            k++;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<altitude.length; i++) {
            if(altitude[i] > max) {
                max = altitude[i];
            }
        }

        return max;
        
    }
}