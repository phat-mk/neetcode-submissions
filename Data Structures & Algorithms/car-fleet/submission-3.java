class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        double[][] arrival = new double[n][2];

        for(int i = 0; i < n; i++) {
            arrival[i][0] = position[i];

            double time = (double)(target - position[i]) / speed[i];
            arrival[i][1] = time;
        }

        Arrays.sort(arrival, (a, b) -> Double.compare(a[0], b[0]));

        int fleets = 0;
        double currentTime = 0;
        for(int i = n - 1; i >= 0; i--) {
            double time = arrival[i][1];
            if(time > currentTime) {
                fleets++;
                currentTime = time;
            }
        }
        return fleets;
    }
}