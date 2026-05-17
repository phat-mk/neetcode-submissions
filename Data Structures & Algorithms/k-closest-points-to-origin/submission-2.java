class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(calculateDistance(b), calculateDistance(a)));

        for(int i =0; i < points.length; i++) {
            maxHeap.add(points[i]);
        if (maxHeap.size() > k)  maxHeap.poll();
        }

        int[][] result = new int[k][2];
        int i = 0;
        for (int[] ele : maxHeap) {
            result[i++] = ele;
        }

        return result;
    }

    public double calculateDistance(int[] point) {
        return Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
    }
}