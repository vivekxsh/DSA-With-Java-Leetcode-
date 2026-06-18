class Solution {
    public double angleClock(int hour, int minutes) {

        double hourHand = 30 * hour + 0.5 * minutes;
        double minuteHand = 6 * minutes;

        double difference = Math.abs(hourHand - minuteHand);

        double minimumAngle = Math.min(difference, Math.abs(360-difference));

        return minimumAngle;
        
    }
}