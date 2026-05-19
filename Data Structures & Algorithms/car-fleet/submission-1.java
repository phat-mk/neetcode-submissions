class Solution {

    public int carFleet(
        int target,
        int[] position,
        int[] speed
    ) {

        int n = position.length;

        double[][] cars = new double[n][2];

        // position + time
        for (int i = 0; i < n; i++) {

            cars[i][0] = position[i];

            cars[i][1] =
                (double)(target - position[i])
                / speed[i];
        }

        // sort by position
        Arrays.sort(cars,
            (a, b) -> Double.compare(a[0], b[0]));

        int fleets = 0;

        double currentTime = 0;

        // process from closest to target
        for (int i = n - 1; i >= 0; i--) {

            double time = cars[i][1];

            // new fleet
            if (time > currentTime) {

                fleets++;

                currentTime = time;
            }
        }

        return fleets;
    }
}