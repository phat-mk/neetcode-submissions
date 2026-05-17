class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i : nums) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        System.out.println(hash);
        PriorityQueue<Integer> max_heap = new PriorityQueue<>((a, b) -> hash.get(b) - hash.get(a));
        max_heap.addAll(hash.keySet());
        int[] result = new int[k];
        for (int i = 0 ; i < k ; i++) {
            result[i] = max_heap.poll();
        }
        return result;
    }
}