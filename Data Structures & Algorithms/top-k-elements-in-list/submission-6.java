class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[k];
        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucketSort = new ArrayList[nums.length + 1];

        for(int key : hashMap.keySet()){
            int frequent = hashMap.get(key);
            if (bucketSort[frequent] == null) {
                bucketSort[frequent] = new ArrayList<>();
            }
            bucketSort[frequent].add(key);
        }
        List<Integer> tempResult = new ArrayList<>();
        for(int i = bucketSort.length - 1; i >= 0 && tempResult.size() < k; i--) {
            if (bucketSort[i] != null) {
                tempResult.addAll(bucketSort[i]);
            }
        }

        for(int i = 0; i < k ; i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }
}