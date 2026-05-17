class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> hashMap.get(b) - hashMap.get(a));
        for(int key: hashMap.keySet()) {
            maxHeap.add(key);
        }

        int[] result = new int[k];
        for(int i = 0 ; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
}