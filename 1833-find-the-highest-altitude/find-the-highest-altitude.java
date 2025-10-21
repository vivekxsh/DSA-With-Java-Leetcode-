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

        Arrays.sort(altitude);

        return altitude[altitude.length-1];
        
    }
}