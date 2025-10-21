class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;
        int[] altitude = new int[n+1];

        altitude[0] = 0;
        int k = 0;

        for(int i=0; i<n; i++) {
            int sum = gain[i] + altitude[k];

            altitude[k+1] = sum;
            k++;
        }


        int peak = Integer.MIN_VALUE;

        for(int i=0; i<=n; i++) {
            if(altitude[i] > peak) {
                peak = altitude[i];
            }
        }

        return peak;

        // Arrays.sort(altitude);

        // return altitude[altitude.length-1];
        
    }
}