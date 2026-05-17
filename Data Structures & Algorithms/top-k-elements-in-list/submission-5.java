class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> hashMap.get(b) - hashMap.get(a));
        int[] result = new int[k];
        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for(int key : hashMap.keySet()){
            maxHeap.add(key);
        }
        for(int i =0 ; i< k; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
}