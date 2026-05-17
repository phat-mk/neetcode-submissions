class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> bucketSort = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            bucketSort.add(new ArrayList<>());
        }
        for(int num: hashMap.keySet()) {
            int freq = hashMap.get(num);
            bucketSort.get(freq).add(num);
        }

        List<Integer> tempResult = new ArrayList<>();
        for(int i = bucketSort.size() - 1; i >= 0 && tempResult.size() <= k; i--){
            if(bucketSort.get(i) != null) {
                tempResult.addAll(bucketSort.get(i));
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }
}