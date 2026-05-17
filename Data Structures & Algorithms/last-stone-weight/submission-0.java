class Solution {
    private int result;
    public int lastStoneWeight(int[] stones) {

        if (stones.length == 0) return 0;

        if (stones.length == 1) return stones[0];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int ele : stones) {
            maxHeap.add(ele);
        }
        simulateStone(maxHeap);
        return result;
    }

    public void simulateStone(PriorityQueue<Integer> maxHeap) {
        if (maxHeap.size() == 0) {
            result = 0;
            return;
        }
        if (maxHeap.size() == 1) {
            result = maxHeap.poll();
            return;
        }

        int largestStone = maxHeap.poll();
        int secondLargestStone = maxHeap.poll();

        if (largestStone == secondLargestStone) {
            simulateStone(maxHeap);
        } else {
            maxHeap.add(Math.max(largestStone, secondLargestStone) - Math.min(largestStone, secondLargestStone));
            simulateStone(maxHeap);
        }
    }
}
