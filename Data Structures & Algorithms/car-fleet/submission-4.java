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
        Stack<Double> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--) {
            double time = arrival[i][1];
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}