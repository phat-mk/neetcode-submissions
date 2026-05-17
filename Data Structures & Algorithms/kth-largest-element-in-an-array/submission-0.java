class Solution {
    private int result;
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1) return nums[0];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int ele : nums) {
            add(ele, k, minHeap);
        }
        
        return result;
    }

    public void add(int val, int k, PriorityQueue<Integer> minHeap) {
        minHeap.add(val);

        if (minHeap.size() > k) minHeap.poll();

        result = minHeap.peek();
    }
}